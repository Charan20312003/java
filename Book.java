class Book {
    static String title = "The Great Gatsby";
    static String author = "F. Scott Fitzgerald";
    static String genre = "Classic Fiction";
    static String pages = "200";
    static String publisher = "Scribner";

    public static void main(String[] args) {
        updateBook();
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Genre: " + genre);
        System.out.println("Pages: " + pages);
        System.out.println("Publisher: " + publisher);
    }

    public static void updateBook() {
        title = "1984";
        author = "George Orwell";
        genre = "Dystopian";
        pages = "328";
        publisher = "Penguin Books";
    }
}
