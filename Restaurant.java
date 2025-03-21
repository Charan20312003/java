class Restaurant {
    static String name = "Tasty Bites";
    static String location = "Downtown";
    static int rating = 4;

    public static void main(String[] args) {
        System.out.println("Before Update:");
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Rating: " + rating + " stars");

        updateRestaurant();

        System.out.println("\nAfter Update:");
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Rating: " + rating + " stars");
    }

    public static void updateRestaurant() {
        name = "Gourmet Hub";
        location = "Uptown";
        rating = 5;
    }
}
