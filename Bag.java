class Bag {
    static String brand = "American Tourister";
    static String type = "Backpack";
    static int price = 2500;

    public static void main(String[] args) {
        System.out.println("Before Update:");
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Price: ₹" + price);

        updateBag();

        System.out.println("\nAfter Update:");
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Price: ₹" + price);
    }

    public static void updateBag() {
        brand = "Skybags";
        type = "Laptop Bag";
        price = 3500;
    }
}
