package extendss;

public class Ok {
    int a = 12;
    String name = "ddl";


    public static void main(String[] args) {
        int b=50;
        Ok o = new Ok();
        System.out.println(o.a+""+o.name);

        class Hello extends Ok {

        }


    }
}