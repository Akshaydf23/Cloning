package Encapsulation;

public class Dmart {

    private int id=0;
    private String name="dd";
    private double price=12.2;
    
    
    public int getId() {
        
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
