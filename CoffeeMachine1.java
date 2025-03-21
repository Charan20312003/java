
  class CoffeeMachine1 {
    
    static String product = "Coffee Machine";  
    static String capacity = "1.2 liters";
    static String brewingModes = "Espresso, Latte, Cappuccino";
    static String power = "1200W";
    static String autoShutoff = "After 15 minutes of inactivity";

    public static void main(String[] args) {
        
        updateCoffeeMachine1(); 

        System.out.println("Before Update:");

        System.out.println("Product: " + product);
        System.out.println("Capacity: " + capacity);
        System.out.println("Brewing Modes: " + brewingModes);
        System.out.println("Power: " + power);
        System.out.println("Auto Shutoff: " + autoShutoff);
    }

    public static void updateCoffeeMachine1() {
	System.out.println("\nAfter Update:");

        product = "Tea Machine";  
        capacity = "1.4 liters";
        brewingModes = "Cappuccino";
        power = "1400W";
        autoShutoff = "After 10 minutes of inactivity";
    }
}
    