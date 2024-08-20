import java.util.*;

public class WC {
    public static void main(String[] args) {
        if (args[0].equals("-w")) {
            System.out.println(wordCount(args[1]));
        }

        if (args[0].equals("-m")) {
            System.out.println(charCount(args[1]));
        }
		
		if (args[0].equals(-1)) {
			System.out.println(lineCount(args[1]));
		}
		
		if (args[0].equals("-s")) {
			System.out.println(lexCount(args[1]));
		}
		
		if (args[0].equals("-b")) {
			System.out.println(bagWordsCount(args[1]));
		}
    }

    private static int wordCount(String input) {
        String[] words = input.split("\\s");
        return words.length();
    }

    private static int charCount(String input) {
        return input.length();
    }
	
	private static int lineCount(String input) {
		String[] lines = input.split("\\n");
		return lines.length();
	}
	
	private static float lexCount(String input) {
		String[] words = input.split("\\s");
		int totalWordsSize = words.length;
		HashSet<String> uniqueWords = new HashSet<String>();
		
		for (int i=0; i < words.length; i++) {
			if (uniqueWords.contains(words[i]) == false) {
				uniqueWords.add(words[i]);
			}
		}
		
		int uniqueSize = uniqueWords.size();
		
		return ((float) uniqueSize / (float) totalWordsSize);
	}
	
	private static int[] bagWordsCount(String input) {
		return new int[10];
	}
	
}
