package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileRead {

    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
            System.out.println("You have not provided file");
        }
    }

    public static void readFile() throws FileNotFoundException {
        FileReader fileReader = new FileReader("D:\\Projects\\DesignPattern\\src\\FileRead.java");
    }
}
