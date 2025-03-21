class AirConditioner {
    static String brand = "LG";
    static String model = "DualCool";
    static int power = 2000;

    public static void main(String[] args) {
        System.out.println("Before Update:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Power: " + power + "W");

        updateAirConditioner();

        System.out.println("\nAfter Update:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Power: " + power + "W");
    }

    public static void updateAirConditioner() {
        brand = "Samsung";
        model = "WindFree";
}
}
