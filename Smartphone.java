class Smartphone {
    static String brand = "Samsung";
    static String model = "Galaxy S22";
    static String display = "6.5-inch AMOLED";
    static String battery = "4500mAh";
    static String camera = "108MP";

    public static void main(String[] args) {
        updateSmartphone();
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Display: " + display);
        System.out.println("Battery: " + battery);
        System.out.println("Camera: " + camera);
    }

    public static void updateSmartphone() {
        brand = "Apple";
        model = "iPhone 14 Pro";
        display = "6.1-inch Super Retina";
        battery = "4200mAh";
        camera = "48MP";
    }
}
