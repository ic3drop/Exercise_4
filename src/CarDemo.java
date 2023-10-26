public class CarDemo {
    public static void main(String[] args) {
        Car car = new Car();
        //System.out.println(car.toString());

        car.sell();
        car.setModel("SL65");
        car.getBrand();
        car.getYear();
        car.getPrice();
        car.getColor();
        car.getQuantity();
        System.out.println(car.toString());
    }
}
