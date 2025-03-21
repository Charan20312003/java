public class Customer {
    String name;

    public Customer(String name) {
        this.name = name;
    }

    public void buyAlcohol() {
        System.out.println(name + " is buying alcohol.");
    }
}
