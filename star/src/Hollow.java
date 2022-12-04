package src;

public class Hollow {
    static int a=90;
    void fun()
    {
        int b=10;
        System.out.println(a+" "+b);
        a++;b++;
    }

    public static void main(String[] args) {

        Hollow r= new Hollow();
        r.fun();
        r.fun();
            }


}
