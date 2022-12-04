package Encapsulation;

import Encapsulation.Cars;

public class Car {

    public static void main(String[] args) {

        Cars car = new Cars();

        car.setId(7);
        car.setName("FERRARI");
        car.setPrice(505050505);

        System.out.println(car.getId() + "\n"   + car.getPrice()+ "\n" + car.getName());
    }
}
