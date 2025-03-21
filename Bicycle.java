class Bicycle {
    static String brand = "Hero";
    static int price = 8000;
    static String type = "Mountain Bike";

    public static void main(String args[]) {
        System.out.println("Before Update:");
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Type: " + type);

        updateBicycle();

        System.out.println("\nAfter Update:");
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Type: " + type);
    }

    public static void updateBicycle() {
        brand = "Giant";
        price = 15000;
        type = "Hybrid Bike";
    }
}
