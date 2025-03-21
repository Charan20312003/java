class WhatsAppRunner {
    public static void main(String[] args) {
        String result = WhatsApp.signUp(
            "Charan",                      "Cherry",                      "9876543210",                  "01-01-2000",     
            "charan@example.com",             "Male",                       "password123");

        System.out.println(result);
        WhatsApp.signIn("9876543210", "password123");
    }
}
