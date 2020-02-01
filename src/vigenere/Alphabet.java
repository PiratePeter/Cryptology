package vigenere;

enum Alphabet {
	GERMAN('e') {
		@Override
		String prepareText(String text) {
			return text.replaceAll("\\s", "").toLowerCase().replaceAll("�", "ue").replaceAll("�", "oe")
					.replaceAll("�", "ae").replaceAll("�", "ss").replaceAll("[^a-zA-Z ]", "");
		}
	},
	ENGLISH('e');

	static String prepareText(Alphabet alphabet, String text) {
		return alphabet.prepareText(text);
	}

	private final char mostCommonLetter;

	private Alphabet(final char mostCommonLetter) {
		this.mostCommonLetter = mostCommonLetter;
	}

	String prepareText(String text) {
		return text.replaceAll("\\s", "").toLowerCase().replaceAll("[^a-zA-Z ]", "");
	}

	char getMostCommonLetter() {
		return mostCommonLetter;
	}
}
