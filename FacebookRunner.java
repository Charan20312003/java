class FacebookRunner {
    public static void main(String[] args) {
        // Calling the sign-up function
        String result = Facebook.signUp("Charan", "HJ", "9876543210", "01-01-2000", "charan@example.com", "Male", "securePass123", "FB123");
        System.out.println(result);

        // Calling the sign-in function
        Facebook.signIn("charan@example.com", "securePass123");
    }
}
