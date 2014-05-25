public class ReverseEncryptor implements Encryptor {
	private String reverse;
	int key = 0;

	@Override
	public String setEncryptStrategie(String text, int key) {
		reverse = "";
		for (int i = text.length() - 1; i >= 0; i--) {
			reverse += text.charAt(i);
		}
		return reverse;
	}
}