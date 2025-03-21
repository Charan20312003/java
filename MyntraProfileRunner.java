class MyntraProfileRunner {
    public static void main(String[] args) {
        String result = MyntraProfile.signUp("Charan", "Cherry", "9876543210", "10-05-2002", "charancherry@gmail.com", "Male", "mySecurePass", "1234");
        System.out.println(result);

        if (result.equals("User Signup Successful! Welcome to Myntra.")) {
            MyntraProfile.signIn("9876543210", "mySecurePass");
        }
    }
}
