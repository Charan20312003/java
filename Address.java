public class Address {
    Country refCountry; 

    public Address(Country refCountry) {
        this.refCountry = refCountry;
    }

    public void displayAddress() {
        System.out.println("Address Details:");
        refCountry.displayCountry();
    }
}
