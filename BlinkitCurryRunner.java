class BlinkitCurryRunner {
    public static void main(String[] args) {
        String curryName = "Butter Chicken"; 
        double price = BlinkitCurry.search(curryName);
        System.out.println("Price of " + curryName + ": ₹" + price);
    }
}
