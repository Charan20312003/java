public class Citizen {
    String name;
    int age;

    public Citizen(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void applyForPassport() {
        System.out.println(name + " is applying for a passport.");
    }
}
