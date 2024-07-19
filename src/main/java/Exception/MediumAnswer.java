package Exception;

import io.github.pixee.security.BoundedLineReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.rmi.NoSuchObjectException;

public class MediumAnswer {
    // 1 .
    public void customException(int[] num) {
        int sum = 0;
        try {
            for (int n : num) {
                sum += n;
            }
        } catch (NullPointerException | ArithmeticException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }

    // 2.
    public void chainedException() {
        try {
            try {
                throw new ArithmeticException("Division error");
            } catch (ArithmeticException e) {
                throw new IOException("IO error caused by division error", e);
            }
        } catch (IOException e) {
            System.out.println("Caught Exception: " + e.getMessage());
            System.out.println("Cause: " + e.getCause());
        }
    }


    // 3.
    public void tryWithResources() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("nonexistentfile.txt"))) {
            String reader;
            while ((reader = BoundedLineReader.readLine(bufferedReader, 5_000_000)) != null) {
                System.out.println(reader);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


    // 4
    public static void method1() throws Exception {
        throw new Exception("This is exception in method 1");
    }

    public static void method2() throws Exception {
        method1();
    }

    public static void main(String[] args) {
         try {
             method2();
         } catch (Exception e) {
             System.out.println("Caught Exception: " + e.getMessage());
         }
    }






    public void multipleException() {
        // 5.
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("nonexistentfile.txt"));
            int result = 10 / 0;
        } catch (ArithmeticException | FileNotFoundException e) {
            System.out.println("Caught Exception: " + e.getMessage());

        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        } finally {
            System.exit(0);
        }
    }
}
