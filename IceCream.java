class IceCream {
    static String flavor = "Chocolate";
    static int price = 100;
    static String quality = "Good";

    public static void main(String args[]) {
        System.out.println("Before Update:");
        System.out.println("Flavor: " + flavor);
        System.out.println("Price: " + price);
        System.out.println("Quality: " + quality);

        updateIceCream();

        System.out.println("\nAfter Update:");
        System.out.println("Flavor: " + flavor);
        System.out.println("Price: " + price);
        System.out.println("Quality: " + quality);
    }

    public static void updateIceCream() {
        flavor = "Vanilla";
        price = 120;
        quality = "Excellent";
    }
}
