package List;

import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {


        //create linkedList
        LinkedList<String> animal=new LinkedList<>();

        //add elments to the linkedList
        animal.add("Dog");
        animal.add("Cat");
        animal.add("Tiger");

        System.out.println(animal);

        animal.add(1,"LIOn");
        System.out.println(animal);

        }


    }


