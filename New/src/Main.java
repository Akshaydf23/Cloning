import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age");
        a = scanner.nextInt();
        b = scanner.nextInt();



        if ( a== b){

            System.out.println("Equal");

        }

        else  if(a >b){
                System.out.println("a is greater");
            }
        else{
                System.out.println("a is lesser");
            }

        }


    }