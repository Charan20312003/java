public class Patient {
    String name;
    Address refAddress;

    public Patient(String name, Address refAddress) {
        this.name = name;
        this.refAddress = refAddress;
    }

    public void displayPatientDetails() {
        System.out.println("Patient Name: " + name);
        refAddress.displayAddress();
    }
}
