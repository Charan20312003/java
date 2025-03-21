class WaterBottle {
    static String brand = "Milton";
    static int capacity = 1;
    static int price = 500;

    public static void main(String[] args) {
        System.out.println("Before Update:");
        System.out.println("Brand: " + brand);
        System.out.println("Capacity: " + capacity + "L");
        System.out.println("Price: ₹" + price);

        updateWaterBottle();

        System.out.println("\nAfter Update:");
        System.out.println("Brand: " + brand);
        System.out.println("Capacity: " + capacity + "L");
        System.out.println("Price: ₹" + price);
    }

    public static void updateWaterBottle() {
        brand = "Cello";
        capacity = 2;
        price = 800;
    }
}
