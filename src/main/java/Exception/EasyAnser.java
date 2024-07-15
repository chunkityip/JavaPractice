package Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class EasyAnser {
    public static void main(String[] args) {
        // 1
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by Zero");
            // 3.
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

        FileReader fileReader = null;
        // 2.
        try {
            fileReader = new FileReader("fileName.txt");
            // Add file reading logic here
        } catch (FileNotFoundException e) {
            System.out.println("Can't find such file");
            // 3.
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    System.out.println("Failed to close FileReader");
                }
            }
        }

        System.exit(0);
    }
}

