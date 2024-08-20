public class MonoAlphSubstitution extends Substitution {
	
	public char[] defaultAlphabet = ['a'..'z'];
	
	public char encrypt(char c) {
		
	}
	public char decrypt(char c) {
		
	}
	
	public static void main(String[] args) {
		if (args.length < 3) {
			System.out.println("Too few parameters!\nUsage: java MonoAlphSubstitution encrypt key \"cipher text\"");
		} else if (args.length > 3) {
			System.out.println("Too many parameters!\nUsage: java MonoAlphSubstitution encrypt key \"cipher text\"");
		} else if (args[0] != "decrypt" && args[0] != "encrypt") {
			System.out.println("The first parameter must be \"encrypt\" or \"decrypt\"!\nUsage: java MonoAlphSubstitution encrypt key \"cipher text\" ");
		} else {
			
			
		}
	}
}