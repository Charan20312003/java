class Pen {
    static String brand = "Reynolds";
    static String inkColor = "Blue";
    static int price = 10;

    public static void main(String[] args) {
        System.out.println("Before Update:");
        System.out.println("Brand: " + brand);
        System.out.println("Ink Color: " + inkColor);
        System.out.println("Price: ₹" + price);

        updatePen();

        System.out.println("\nAfter Update:");
        System.out.println("Brand: " + brand);
        System.out.println("Ink Color: " + inkColor);
        System.out.println("Price: ₹" + price);
    }

    public static void updatePen() {
        brand = "Parker";
        inkColor = "Black";
        price = 150;
    }
}
