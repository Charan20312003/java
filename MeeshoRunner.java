class MeeshoRunner {
    public static void main(String[] args) {
        String result = Meesho.signUp(
            "Charan",                      "Cherry",                      "9876543210",     
            "01-01-2000",                  "charan@example.com", // Email
            "Male",        "password123",      "MEESHO123"  );

        System.out.println(result);
        Meesho.signIn("charan@example.com", "password123");
    }
}
