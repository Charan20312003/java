class UberEatsRunner {
    public static void main(String[] args) {
        String dessertName = "Tiramisu"; // Change this to test different desserts
        double price = UberEatsDesserts.search(dessertName);
        
        System.out.println("Price of " + dessertName + ": ₹" + price);
    }
}
