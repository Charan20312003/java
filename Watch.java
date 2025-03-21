class Watch {
    static String brand = "Titan";
    static int price = 5000;
    static String type = "Analog";

    public static void main(String args[]) {
        System.out.println("Before Update:");
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Type: " + type);

        updateWatch();

        System.out.println("\nAfter Update:");
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Type: " + type);
    }

    public static void updateWatch() {
        brand = "Rolex";
        price = 500000;
        type = "Smartwatch";
    }
}
