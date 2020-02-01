package vigenere;

final class VigenereCryptographer {

	private final char[] keyword;

	VigenereCryptographer(final String keyword) {
		this.keyword = keyword.toCharArray();
	}

	String encipherText(final String plainText) {
		char[] charArray = plainText.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			int shift = keyword[i % keyword.length] - 'a';
			charArray[i] = encipherLetter(charArray[i], shift);
		}
		return String.valueOf(charArray);
	}

	private char encipherLetter(char letter, final int shift) {
		letter += shift;
		if (letter > 'z') {
			letter -= 26;
		}
		return letter;
	}

}
