class MovieInfo {
    static String name = "Avengers";
    static int duration = 180;
    static String genre = "Action";

    public static void main(String args[]) {
        System.out.println("Before Update:");
        System.out.println("Name: " + name);
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Genre: " + genre);

        updateMovie();

        System.out.println("\nAfter Update:");
        System.out.println("Name: " + name);
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Genre: " + genre);
    }

    public static void updateMovie() {
        name = "Inception";
        duration = 150;
        genre = "Sci-Fi";
    }
}
