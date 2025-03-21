class OlaFoodsRunner {
    public static void main(String[] args) {
        String iceCreamName = "Red Velvet"; 
        double price = OlaFoodsIceCream.search(iceCreamName);
        
        System.out.println("Price of " + iceCreamName + ": ₹" + price);
    }
}
