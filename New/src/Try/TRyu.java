package Try;

import java.security.spec.ECField;

public class TRyu {
    public static void main(String[] args) {


        int a = 10;
        int b = 20;
        int c = a + b;

        try {
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println("Cd");
        }
    }
}