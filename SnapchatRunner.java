class SnapchatRunner {
    public static void main(String[] args) {
        String result = Snapchat.signUp(
            "Charan",            
            "H J",              
            "9876543210",       
            "01-01-2000",        
            "charan@example.com",             "Male",            
            "snapchat123"       
        );

        System.out.println(result);
        Snapchat.signIn("charan@example.com", "snapchat123");
    }
}
