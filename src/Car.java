import java.util.Scanner;

class Car {
    private String model;
    private String brand;
    private int year;
    private double price;
    private String color;
    private int quantity;

    public Car(){
        model = "G63";
        brand = "Mercedes Benz";
        year = 2019;
        price = 89999.99D;
        color = "Hot Pink";
        quantity = 4;
    }

    public String getModel(){
        return model;
    }
    void setModel(String model){
        this.model = model;
    }
    public String getBrand(){
        return brand;
    }
    void setBrand(String brand){
        this.brand = model;
    }
    public int getYear(){
        return year;
    }
    void setYear(int year){
        this.year = year;
    }
    public double getPrice(){
        return price;
    }
    void setPrice(int price){
        this.price = price;
    }
    public String getColor(){
        return color;
    }
    void setColor(String color){
        this.color = color;
    }
    public int getQuantity(){
        return quantity;
    }
    void setQuantity(int quantity){
        this.quantity = quantity;
    }
    void delivery(){
        quantity++;
    }
    void sell(){
        quantity--;
    }
    public String toString() { //overriding the toString() method
        return ("Brand: " + getBrand() + "\nModel: " + getModel() + "\nYear: " + getYear() + "\nPrice: " + getPrice()
                + "\nColor: " + getColor() + "\nQuantity: " + getQuantity());
    }
}
