class Shoe {
    static String brand = "Nike";
    static String type = "Running";
    static int price = 120;

    public static void main(String[] args) {
        System.out.println("Before Update:");
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Price: $" + price);

        updateShoe();

        System.out.println("\nAfter Update:");
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Price: $" + price);
    }

    public static void updateShoe() {
        brand = "Adidas";
        type = "Basketball";
        price = 150;
    }
}
