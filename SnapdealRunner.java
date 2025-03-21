class SnapdealRunner {
    public static void main(String[] args) {
        String result = Snapdeal.signUp(
            "Charan",          
            "Cherry",                      "9876543210",      // Phone Number
            "01-01-2000",                  "charan@example.com", // Email
            "Male",                        "password123",     // Password
            "SNAP123"         
        );

        System.out.println(result);
        Snapdeal.signIn("charan@example.com", "password123");
    }
}
