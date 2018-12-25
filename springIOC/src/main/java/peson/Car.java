package peson;

public class Car {
    private String brand;
    private String corp;
    private double price;
    public int maxSpeed;
    public Car(String brand, String corp, int maxSpeed) {
        this.brand = brand;
        this.corp = corp;
        this.maxSpeed = maxSpeed;
    }

    public Car(String brand, String corp, double price) {
        this.brand = brand;
        this.corp = corp;
        this.price = price;
    }

    @Override
    public String toString(){
        return "car{"+"brand:"+brand
                +"price:"+price+"corp:"+corp+"}" +
                "maxSpeed:"+maxSpeed+"}";
    }
}
