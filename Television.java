class Television {
    static String brand = "Sony";
    static int price = 40000;
    static String screenSize = "42 inches";

    public static void main(String args[]) {
        System.out.println("Before Update:");
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Screen Size: " + screenSize);

        updateTelevision();

        System.out.println("\nAfter Update:");
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Screen Size: " + screenSize);
    }

    public static void updateTelevision() {
        brand = "Samsung";
        price = 60000;
        screenSize = "55 inches";
    }
}
