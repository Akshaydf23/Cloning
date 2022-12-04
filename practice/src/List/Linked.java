package List;

import java.util.LinkedList;

public class Linked {
    public static void main(String[] args) {

        LinkedList<String> core = new LinkedList<>();

        core.add("Java");
        core.add("Python");
        core.add("HTML");
        System.out.println(core);

        //get the elemetns from the linked list

        String str =core.get(1);

        System.out.println(str);

        String str2 =core.get(2);
        System.out.println(str2);

        core.set(1,"CSs");
        System.out.println(core);

    }
}
