class Clock {
    static String type = "Analog";
    static String brand = "Titan";
    static int price = 1500;

    public static void main(String[] args) {
        System.out.println("Before Update:");
        System.out.println("Type: " + type);
        System.out.println("Brand: " + brand);
        System.out.println("Price: ₹" + price);

        updateClock();

        System.out.println("\nAfter Update:");
        System.out.println("Type: " + type);
        System.out.println("Brand: " + brand);
        System.out.println("Price: ₹" + price);
    }

    public static void updateClock() {
        type = "Digital";
        brand = "Casio";
        price = 2500;
    }
}
