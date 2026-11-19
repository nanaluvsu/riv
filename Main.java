/*
    Client imports lib
    Client calls lib to servers
    Servers receive a n-sized array to be evaluated
    Calculates performance and returns to client
    Result is saved to a csv
    
*/

import java.util.InputMismatchException;

public class Main {
    public static int size;
    public static void main(String[] args) {
        try {
            if (args[0] != null) {
                
            size = Integer.parseInt(args[0]);
            System.out.println("Array size: " + size + " elements.");
        }
        } catch (InputMismatchException | NumberFormatException ex) {
            System.out.println("Size not specified. 1.000.000 elements array will be used.");
        }
    
        
        System.out.println("Hello World!");
    }
}



