public class CaesarEncryptor implements Encryptor {
	String text = "";
	int key;

	@Override
	public String setEncryptStrategie(String text, int key) {
		text = text.toUpperCase();
		char[] chars = text.toCharArray();
		for (int i = 0; i < text.length(); i++)
			chars[i] = encode(chars[i], key);
		return String.valueOf(chars);
	}

	public char encode(char c, int key) {
		if (c >= 'A' && c <= 'Z')
			return (char) ((c - 'A' + key) % 26 + 'A');
		else
			return c;
	}
}
