package src;

import java.util.Scanner;

public class Pattern {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows to be print in pattern");

        int rows = scanner.nextInt();
        System.out.println("Printing the pattern");

        for(int i=1; i<=rows; i++){

            for(int j=rows; j>=i; j--){

                System.out.print(" * ");

            }
            System.out.println();

        }
        scanner.close();

    }
}
