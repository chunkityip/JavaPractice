package Exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class handlingAnswer {

    //====================Easy
    public int divide(int a , int b) {
        int num = 0;
       try {
           num = a / b;
        } catch (ArithmeticException e) {
           System.out.println("Can't divide by zero");
       }
       return num;
    }

    public int converts(String a) {
        int num = 0;
        try {
            num = Integer.parseInt(a);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } catch (NullPointerException e) {
            System.out.println("Input cannot be null.");
        }
        return num;
    }

    public void fileReader(String filePath) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filePath));
            String lines;
            while ((lines = reader.readLine()) != null ){
                System.out.println(lines);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (reader != null) {
                    reader.close();;
                }
            } catch (IOException e) {
                System.out.println("An error occurred while closing the file: " + e.getMessage());
            }
        }
    }

    //==================== Medium

}
