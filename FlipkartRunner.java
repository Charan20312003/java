class FlipkartRunner {
    public static void main(String[] args) {
        String captcha = "FLIP123";         String result = Flipkart.signUp(
            "Charan",          // First Name
            "Cherry",          // Last Name
            "9876543210",      // Phone Number
            "01-01-2000",      // Date of Birth
            "charan@example.com", // Email
            "Male",            // Gender
            "password123",     // Password
            captcha            // Entered Captcha
        );

        System.out.println(result);

        Flipkart.signIn("charan@example.com", "password123");
    }
}
