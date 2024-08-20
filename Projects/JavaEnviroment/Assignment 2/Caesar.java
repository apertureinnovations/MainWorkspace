
public class Caesar extends MonoAplhSubstitution {
	
	public int shift;
	
	public static void main(String[] args) {
		if (args.length < 2) {
			System.out.println("Too few parameters!\nUsage: java Caesar n \"cipher text\"");
		} else if (args.length > 2) {
			System.out.println("Too many parameters!\nUsage: java Caesar n \"cipher text\"");
		} else {
			String newStr = rotate((Integer.parseInt(args[0])),args[1]);
			System.out.println(newStr);
		}
	};
	  
	public static char rotate(int a, char b) {
		int ascConv = (int) b;
		int newA;
		if (a < 0) {
			newA = 0 -(-a % 26);
		} else {
			newA = a % 26;
		}
		int newAsc = ascConv + newA;
		
		if (97 <= ascConv && ascConv <= 122) {
			if (97 <= newAsc && newAsc <= 122) {
				char c = (char) newAsc;
				return c;
		  } else if (71 <= newAsc && newAsc <= 96) {
				char c = (char) (newAsc + 26);
				return c;
		  } else if (123 <= newAsc && newAsc <= 149) {
				char c = (char) (newAsc - 26);
				return c;
		  }
		} else if (65 <= ascConv && ascConv <= 90) {
			if (65 <= newAsc && newAsc <= 90) {
				char c = (char) newAsc;
				return c;
		  } else if (39 <= newAsc && newAsc <= 64) {
				char c = (char) (newAsc + 26);
				return c;
		  } else if (91 <= newAsc && newAsc <= 117) {
				char c = (char) (newAsc - 26);
				return c;
		  }
		}
		
		return b;
		// 97-122 for lowercase, 65-90 for uppercase.
	};
	  
	public static String rotate(int a, String b) {
		char n;
		char y;
		String c = "";
		for (int i = 0; i < b.length(); i++) {
			y = b.charAt(i);
			n = rotate(a, y);
			c = c + n;
		}
		String newStr = c;
		return newStr; 
	};
}
