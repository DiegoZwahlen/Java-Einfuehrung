public class Car {
    String brand;
    String model;
    int buildYear;

    // Konstruktor: setzt alle Attribute
    public Car(String brand, String model, int buildYear) {
        this.brand = brand;
        this.model = model;
        this.buildYear = buildYear;
    }

    public void PrintCarInfo() {
        System.out.println("Marke: " + brand);
        System.out.println("Modell: " + model);
        System.out.println("Baujahr: " + buildYear);
        System.out.println();
    }

    public static void main(String[] args) {
        Car auto1 = new Car("BMW", "M3", 2020);
        Car auto2 = new Car("Ferrari", "F40", 1990);
        Car auto3 = new Car("Peel", "P50", 1962);

        auto1.PrintCarInfo();
        auto2.PrintCarInfo();
        auto3.PrintCarInfo();
    }
}