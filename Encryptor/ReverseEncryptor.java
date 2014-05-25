public class ReverseEncryptor implements Encryptor {
	private String reverse;
	int key = 0;

	@Override
	public String setEncryptStrategie(String text, int key) {
		reverse = "";
		for (int j = text.length() - 1; j >= 0; j--) {
			reverse += text.charAt(j);
		}
		return reverse;
	}

}
