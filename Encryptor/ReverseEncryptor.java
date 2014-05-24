public class ReverseEncryptor implements Encryptor {
	private String reverse = "";

	@Override
	public String setEncryptStrategie(String text) {
		for (int j = text.length() - 1; j >= 0; j--) {
			reverse += text.charAt(j);
		}
		return reverse;
	}

}
