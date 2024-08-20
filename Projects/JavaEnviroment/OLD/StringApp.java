import java.util.Scanner;

public class StringApp {
	//the comp class is silly and i dont wanna use it >:( - it doesnt close scanner obj.
	// id usually put this in its own class but submission doesnt let me do that cuz its smelly
	public static String stringReturn() {
		Scanner scanner = new Scanner(System.in);
		String newStr = scanner.nextLine();
		scanner.close();
		return newStr;
	}
	
	public static int intReturn() {
		Scanner scanner = new Scanner(System.in);
		String newInt = scanner.nextLine();
		scanner.close();
		int newIntParsed = Integer.parseInt(newInt, 10);
		return newIntParsed;
	}
	
	public static double doubleReturn() {
		Scanner scanner = new Scanner(System.in);
		String newDouble = scanner.nextLine();
		scanner.close();
		double newDoubleParsed = Double.parseDouble(newDouble);
		return newDoubleParsed;
	}
	
    // Part 1
    public static String pow(String s, int n) {
		String newN = "";
		for (int x = 0; x < n; x++) {
			newN = newN + s;
		}
        return newN;
    }


    // Part 2
    public static int factorCount(String a, String f){
        // your code here
        return 0;
    }
    
    public static int factorCount(String a, String f, boolean caseSensitive){
        // your code here
        return 0;
    }
    

    // Part 3
    public static void main(String[] args) {
        String input = args[0];

        for (char letter = 'a'; letter <= 'z'; letter++) {  // why does this work?
           // replace the next line. Can you explain what + means here and why?
           System.out.println(letter + ": " + 0);
        }
        
    }
    
}
