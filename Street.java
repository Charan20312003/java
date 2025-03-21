public class Street {
    int streetNo;
    String streetName;

    public Street(int streetNo, String streetName) {
        this.streetNo = streetNo;
        this.streetName = streetName;
    }

    public void displayStreet() {
        System.out.println("Street No: " + streetNo);
        System.out.println("Street Name: " + streetName);
    }
}
