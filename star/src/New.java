package src;

public class New {
    public static void pyramidPattern(int n){

    for(int i=0;i<=n;i++){

        System.out.print(" ");

    }
    for(int j=0;j<=5;j++){
        System.out.print("*");

    }
        System.out.println();//ending line after each row

    }


    public static void main(String[] args) {
        int n=5;
        pyramidPattern(n);
    }
}
