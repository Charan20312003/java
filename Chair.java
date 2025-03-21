class Chair {
    static String material = "Plastic";
    static String color = "Red";
    static int price = 800;

    public static void main(String[] args) {
        System.out.println("Before Update:");
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Price: ₹" + price);

        updateChair();

        System.out.println("\nAfter Update:");
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Price: ₹" + price);
    }

    public static void updateChair() {
        material = "Wood";
        color = "Brown";
        price = 3000;
    }
}
