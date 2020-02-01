package vigenere;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

final class VigenereCodeBreaker {

	private final static int NUMBER_OF_USED_SEQUENCES = 2; // experience value
	private final static int INACCURACY_THRESHOLD = 3; // experience value
	private final int shiftDistance;

	VigenereCodeBreaker(Alphabet alphabet) {
		this.shiftDistance = alphabet.getMostCommonLetter() - 'a';
	}

	int guessKeyWordLength(final String code) {
		System.out.println();
		final HashMap<String, Integer> characterSequenzFrequencyTable = new HashMap<>();
		countLetterSequences(characterSequenzFrequencyTable, code);

		List<Integer> distances = new ArrayList<>();
		for (int i = 0; i < NUMBER_OF_USED_SEQUENCES; i++) {
			String mostFrequentSequence = getKeyWithMaxValue(characterSequenzFrequencyTable);
			characterSequenzFrequencyTable.remove(mostFrequentSequence);
			addDistancesOfSequenceToList(distances, code, mostFrequentSequence);
		}

		// TODO: cache already calculated prime numbers
		List<Integer> generatedPrimenumbers = generatePrimeNumbers(getMaxValue(distances));

		final HashMap<Integer, Integer> primeNumberFrequencyTable = new HashMap<>();
		for (Integer distance : distances) {
			countDividablePrimeNumbers(primeNumberFrequencyTable, generatedPrimenumbers, distance);
		}

		return getMostLikelyPrimeNumberProduct(primeNumberFrequencyTable);
	}

	String getKeyWordFromCode(final String code) {
		return guessKeyWord(code, guessKeyWordLength(code));
	}

	String guessKeyWord(final String code, final int numberOfColumns) {
		char[] mostFrequentLetters = getMostFrequentLetterPerColumn(code.toCharArray(), numberOfColumns);
		for (int i = 0; i < mostFrequentLetters.length; i++) {
			mostFrequentLetters[i] -= shiftDistance;
			if (mostFrequentLetters[i] < 'a') {
				mostFrequentLetters[i] += 26;
			}
		}
		return String.valueOf(mostFrequentLetters);
	}

	char[] getMostFrequentLetterPerColumn(final char[] code, final int numberOfColumns) {
		final HashMap<Character, Integer> characterFrequencyTable = new HashMap<>();
		char[] mostFrequentLetters = new char[numberOfColumns];
		for (int column = 0; column < numberOfColumns; column++) {
			for (int index = column; index < code.length; index += numberOfColumns) {
				increaseCounterOrAdd(characterFrequencyTable, code[index]);
			}
			mostFrequentLetters[column] = getKeyWithMaxValue(characterFrequencyTable).charValue();
			characterFrequencyTable.clear();
		}
		return mostFrequentLetters;
	}

	// private static helpers

	/**
	 * Note: inaccuracy makes this very ugly and instable
	 */
	private static int getMostLikelyPrimeNumberProduct(HashMap<Integer, Integer> primeNumberFrequencyTable) {
		final int threshold = NUMBER_OF_USED_SEQUENCES * (primeNumberFrequencyTable.size() - INACCURACY_THRESHOLD);
		System.out.println("threshold: " + threshold);
		int product = 1;
		System.out.println("primeNumberFrequencyTable: " + primeNumberFrequencyTable);
		System.out.print("KeywordLength could be 1");
		for (Entry<Integer, Integer> entry : primeNumberFrequencyTable.entrySet()) {
			// ignore if threshold isn't reached
			if (threshold < entry.getValue().intValue()) {
				product *= entry.getKey().intValue();
				System.out.print("*" + entry.getKey().intValue());
			}
		}
		System.out.println(" = " + product);
		return product;
	}

	private static void addDistancesOfSequenceToList(List<Integer> distances, final String code, String sequence) {
		final int sequenceLength = sequence.length();
		int fromIndex = 0;
		int index = 0;
		do {
			index = code.indexOf(sequence, fromIndex);
			int distance = index - fromIndex + sequenceLength;
			if (0 < distance) { // because last is nonsense
				distances.add(Integer.valueOf(distance));
			}
			fromIndex = index + sequenceLength;
		} while (index > 0);
	}

	private static void countDividablePrimeNumbers(HashMap<Integer, Integer> primeNumberFrequencyTable,
			List<Integer> primenumbers, int number) {
		for (int i = 0; 1 < number; i++) {
			int primeNumber = primenumbers.get(i).intValue();
			if (number % primeNumber == 0) {
				number = number / primeNumber;
				increaseCounterOrAdd(primeNumberFrequencyTable, primeNumber);
				/*
				 * primefactor should NOT be counted multiple times per number!
				 */
				while (number % primeNumber == 0) {
					number = number / primeNumber;
				}
			}
		}
	}

	private static int getMaxValue(List<Integer> numbers) {
		int max = 0;
		for (Integer number : numbers) {
			if (max < number.intValue()) {
				max = number.intValue();
			}
		}
		return max;
	}

	private static <K> K getKeyWithMaxValue(Map<K, Integer> map) {
		int max = 0;
		K lettersequence = null;
		for (Entry<K, Integer> entry : map.entrySet()) {
			if (max < entry.getValue().intValue()) {
				max = entry.getValue().intValue();
				lettersequence = entry.getKey();
			}
		}
		return lettersequence;
	}

	private static void countLetterSequences(final Map<String, Integer> frequencyTable, final String text) {
		for (int i = 0; i < text.length() - 2; i++) {
			String substring = text.substring(i, i + 3); // search for triples
			increaseCounterOrAdd(frequencyTable, substring);
		}
	}

	private static <K> void increaseCounterOrAdd(final Map<K, Integer> map, final K key) {
		Integer counter = map.get(key);
		if (counter == null) {
			// first occurrence
			map.put(key, Integer.valueOf(1));
		} else {
			// increase counter
			map.put(key, Integer.valueOf(counter.intValue() + 1));
		}
	}

	public static List<Integer> generatePrimeNumbers(final int max) {
		List<Integer> primes = new ArrayList<>();
		primes.add(2);
		for (int i = 3; i <= max; i += 2) {
			primes.add(i);
		}
		for (int index = 1; index < primes.size(); index++) {
			int value = primes.get(index).intValue();
			if (value <= Math.sqrt(max)) {
				for (int factor = value; factor <= max / value; factor += 2) {
					Integer notPrimeNumber = Integer.valueOf(factor * value);
					primes.remove(notPrimeNumber);
				}
			} else {
				break;
			}
		}
		return primes;
	}
}
