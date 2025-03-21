public class MallRunner {
    public static void main(String[] args) {
        
        String customerName = "Devsingh";
        String shopName = "Liquor Store";
        String mallName = "UB City Mall";

       
        Customer customer = new Customer(customerName);
        Shop shop = new Shop(shopName, customer);
        Security security = new Security();
        Parking parking = new Parking();
        Mall mall = new Mall(mallName, shop, security, parking);
        mall.openMall();
    }
}
