class Burger {
    static String name = "Veggie Burger";
    static int price = 150;
    static String quality = "Good";

    public static void main(String args[]) {
        System.out.println("Before Update:");
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quality: " + quality);

        updateBurger();

        System.out.println("\nAfter Update:");
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quality: " + quality);
    }

    public static void updateBurger() {
        name = "Cheese Burger";
        price = 200;
        quality = "Excellent";
    }
}
