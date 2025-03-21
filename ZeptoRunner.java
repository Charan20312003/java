class ZeptoRunner {
    public static void main(String[] args) {
        String dosaName = "Mysore Masala Dosa"; 
        double price = ZeptoDosa.search(dosaName);
        
        System.out.println("Price of " + dosaName + ": ₹" + price);
    }
}
