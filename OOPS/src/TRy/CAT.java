package TRy;

import java.util.Scanner;

class CAT{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers:::");

        int a;
        int b;
        int sum;

        a=scanner.nextInt();
        b=scanner.nextInt();
        sum = a+b;

        System.out.println(sum);
    }
}