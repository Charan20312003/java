public class Netflix {
    public static void main(String[] args) {
        String kannadaMovies[] = {"Kantara", "KGF", "Lucia", "Ugram", "RangiTaranga", "Bell Bottom", "Rajkumari"};
        String hindiMovies[] = {"Dangal", "3 Idiots", "Lagaan", "Zindagi Na Milegi Dobara", "Kabhi Khushi Kabhi Gham", "PK", "Bajrangi Bhaijaan"};
        String englishMovies[] = {"The Shawshank Redemption", "Inception", "The Dark Knight", "Forrest Gump", "Gladiator", "Titanic", "The Godfather"};

        System.out.println("The Kannada Movies list contains: " + kannadaMovies.length + " movies.");
        System.out.println("The Kannada Movies list are:");
        System.out.println(kannadaMovies[0] + " " + kannadaMovies[1] + " " + kannadaMovies[2] + " " +  kannadaMovies[3] + " " + kannadaMovies[4] + " " + kannadaMovies[5] + " " + kannadaMovies[6]);
        
        System.out.println("\nThe Hindi Movies list contains: " + hindiMovies.length + " movies.");
        System.out.println("The Hindi Movies list are:");
        System.out.println(hindiMovies[0] + " " + hindiMovies[1] + " " + hindiMovies[2] + " " +  hindiMovies[3] + " " + hindiMovies[4] + " " + hindiMovies[5] + " " + hindiMovies[6]);

        System.out.println("\nThe English Movies list contains: " + englishMovies.length + " movies.");
        System.out.println("The English Movies list are:");
        System.out.println(englishMovies[0] + " " + englishMovies[1] + " " + englishMovies[2] + " " + englishMovies[3] + " " + englishMovies[4] + " " + englishMovies[5] + " " + englishMovies[6]);
    }
}
