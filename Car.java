public class Car {
    private String brand;
    private String model;
    private int buildYear;

    public Car(String brand, String model, int buildYear) {
        this.brand = brand;
        this.model = model;
        this.buildYear = buildYear;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getBuildYear() {
        return buildYear;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBuildYear(int buildYear) {
        this.buildYear = buildYear;
    }

    @Override
    public String toString() {
        return "Marke: " + brand + "\n"
             + "Modell: " + model + "\n"
             + "Baujahr: " + buildYear;
    }

    public static void main(String[] args) {
        Car auto1 = new Car("BMW", "M3", 2020);
        Car auto2 = new Car("Ferrari", "F40", 1990);
        Car auto3 = new Car("Peel", "P50", 1962);

        System.out.println(auto1);
        System.out.println();

        System.out.println(auto2);
        System.out.println();

        System.out.println(auto3);
    }
}