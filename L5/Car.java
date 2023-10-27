public class Car {
    public String color;
    public String model;

    public Car(String color, String model) {
        this.color = color;
        this.model = model;
    }

    public static void main(String[] args) {
        Car car1 = new Car("city gray", "golf 4");
        Car car2 = new Car("green", "kia picanto");
        Car car3 = car1;

        System.out.println(car1 == car2); // false
        System.out.println(car1 == car3); // true
        System.out.println(car1.equals(car2)); // false
        System.out.println(car1.equals(car3)); // true

        car3.model = "golf 5";
        System.out.println(car1.model); // golf 5
    }
}
