class Laptop {
    static String brand = "Dell";
    static String processor = "Intel i7";
    static String ram = "16GB";
    static String storage = "512GB SSD";
    static String battery = "6 hours";

    public static void main(String[] args) {
        updateLaptop();
        System.out.println("Brand: " + brand);
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ram);
        System.out.println("Storage: " + storage);
        System.out.println("Battery Life: " + battery);
    }

    public static void updateLaptop() {
        brand = "HP";
        processor = "AMD Ryzen 7";
        ram = "32GB";
        storage = "1TB SSD";
        battery = "8 hours";
    }
}
