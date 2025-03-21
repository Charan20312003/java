class University {
    static String name = "Harvard";
    static int ranking = 1;
    static String location = "USA";

    public static void main(String args[]) {
        System.out.println("Before Update:");
        System.out.println("University Name: " + name);
        System.out.println("Ranking: " + ranking);
        System.out.println("Location: " + location);

        updateUniversity();

        System.out.println("\nAfter Update:");
        System.out.println("University Name: " + name);
        System.out.println("Ranking: " + ranking);
        System.out.println("Location: " + location);
    }

    public static void updateUniversity() {
        name = "MIT";
        ranking = 2;
        location = "USA";
    }
}
