class FoodPandaRiceRunner {
    public static void main(String[] args) {
        String riceName = "Biryani";  
        double price = FoodPandaRice.search(riceName);
        System.out.println("Price of " + riceName + ": ₹" + price);
    }
}
