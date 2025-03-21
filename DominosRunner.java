class DominosRunner {
    public static void main(String[] args) {
        String itemName = "Margherita Pizza"; 
        double price = Dominos.search(itemName);
        
        System.out.println("Price of " + itemName + ": ₹" + price);
    }
}
