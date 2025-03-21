class WashingMachine {
    static String brand = "Bosch";
    static String type = "Front Load";
    static int price = 32000;

    public static void main(String[] args) {
        System.out.println("Before Update:");
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Price: ₹" + price);

        updateWashingMachine();

        System.out.println("\nAfter Update:");
        System.out.println("Brand: " + brand);  
        System.out.println("Type: " + type);
        System.out.println("Price: ₹" + price);
    }

    public static void updateWashingMachine() {
        brand = "LG";
        type = "Top Load";
        price = 28000;
    }
}
