public abstract class Substitution implements Cipher {
	
	public abstract char encrypt(char c);
	
	public abstract char decrypt(char c);
	
	public String encrypt(String plaintext) {
		String temp = "";
		char tempchar;
		
		for (i=0; i<plaintext.length(); i++) {
			tempchar = encrypt(plaintext.charAt(i));
			temp += tempchar;
		}
		
		return temp;
	}
	
	public String decrypt(String cryptotext) {
		String temp = "";
		char tempchar;
		
		for (i=0;i<cryptotext.length();i++) {
			tempchar = decrypt(cryptotext.charAt(i));
			temp += tempchar;
		}
		
		return temp;
	}
	
}