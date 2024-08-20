import java.io.*;
import java.util.*;

public class Press {

    private  Map<String, List<Book>> shelf;
    private int shelfSize;
    private Map<String, Integer> edition;

    // Constructor Class
    public Press(String pathToBooKDir, int sSize) {
        shelfSize = sSize;
        shelf = new HashMap<>(shelfSize);

        File dirPath = new File(pathToBooKDir);
        File[] bookList = dirPath.listFiles();

        for(File book : bookList) {
            shelf.put(book.getName(), new ArrayList<>());
            edition.put(book.getName(), 0);
        }
    }

    protected Book print(String bookID, int edition) {
        if () {

        } else {
            throw new IllegalArgumentException("Book is not a part of the libary");
        }
    }

    public static void main(String[] args) {
        // For Debugging
    }
}


???
