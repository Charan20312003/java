public class Shop {
    String shopName;
    Customer customer;

    public Shop(String shopName, Customer customer) {
        this.shopName = shopName;
        this.customer = customer;
    }

    public void serveCustomer() {
        System.out.println("Welcome to " + shopName);
        customer.buyAlcohol();
    }
}
