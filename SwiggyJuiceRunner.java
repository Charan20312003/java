class SwiggyJuiceRunner {
    public static void main(String[] args) {
        String juice = "Mango Juice";
        double price = SwiggyJuice.search(juice);

        System.out.println("The price of " + juice + " is ₹" + price);
    }
}
