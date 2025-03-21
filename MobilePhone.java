class MobilePhone {
    static String brand = "Samsung";
    static int price = 30000;
    static String camera = "48MP";

    public static void main(String args[]) {
        System.out.println("Before Update:");
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Camera: " + camera);

        updateMobilePhone();

        System.out.println("\nAfter Update:");
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Camera: " + camera);
    }

    public static void updateMobilePhone() {
        brand = "Apple";
        price = 80000;
        camera = "108MP";
    }
}
