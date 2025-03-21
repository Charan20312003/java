public class Mall {
    String mallName;
    Shop shop;
    Security security;
    Parking parking;

    public Mall(String mallName, Shop shop, Security security, Parking parking) {
        this.mallName = mallName;
        this.shop = shop;
        this.security = security;
        this.parking = parking;
    }

    public void openMall() {
        System.out.println(mallName + " is now open.");
        parking.allocateParking(shop.customer);
        security.checkCustomer(shop.customer);
        shop.serveCustomer();
    }
}
