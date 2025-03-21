class AmazonRunner {
    public static void main(String[] args) {
        String result = Amazon.signUp(
            "Charan",                      "H J",                        "9876543210",      
            "01-01-2000",                 "charan@example.com", 

            "Male",                       "amazon123"              );

        System.out.println(result);
        Amazon.signIn("9876543210", "amazon123");
    }
}
