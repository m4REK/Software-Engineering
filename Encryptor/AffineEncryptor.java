import java.math.BigInteger;

public class AffineEncryptor implements Encryptor {
	private static int firstKey = 5;
	private static int secondKey;
	private static int module = 26;

	@Override
	public String setEncryptStrategie(String text, int key) {
		// schlüssel (ein wert zwischen 0 und 25!)
		this.secondKey = key;
		StringBuilder builder = new StringBuilder();
		for (int in = 0; in < text.length(); in++) {
			char character = text.charAt(in);
			if (Character.isLetter(character)) {
				character = (char) ((firstKey * (character - 'a') + secondKey)
						% module + 'a');
			}
			builder.append(character);
		}
		return builder.toString();

	}

	public String encrypt(String text) {
		StringBuilder builder = new StringBuilder();
		for (int in = 0; in < text.length(); in++) {
			char character = text.charAt(in);
			if (Character.isLetter(character)) {
				character = (char) ((firstKey * (character - 'a') + secondKey)
						% module + 'a');
			}
			builder.append(character);
		}
		return builder.toString();
	}

	public String decrypt(String input) {
		StringBuilder builder = new StringBuilder();
		// modulo inverse ausrechnen
		BigInteger inverse = BigInteger.valueOf(firstKey).modInverse(
				BigInteger.valueOf(module));
		// decrypt
		for (int in = 0; in < input.length(); in++) {
			char character = input.charAt(in);
			if (Character.isLetter(character)) {
				int decoded = inverse.intValue()
						* (character - 'a' - secondKey + module);
				character = (char) (decoded % module + 'a');
			}
			builder.append(character);
		}
		return builder.toString();

	}

}
