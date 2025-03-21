class WhatsApp {

    // Sign-up method
    public static String signUp(String firstName, String lastName, String phoneNo, String dob, String email, String gender, String password) {
        String ref = null;

        boolean userIsValid = validateUserProfile(firstName, lastName, phoneNo, dob, email, gender, password);

        if (userIsValid) {
            ref = "WhatsApp: User Signup Successful!";
        } else {
            ref = "WhatsApp: Signup Failed! Please check your details.";
        }

        return ref;
    }

    // Sign-in method
    public static void signIn(String phoneNo, String password) {
        System.out.println("User signed in successfully with phone number: " + phoneNo);
    }

    // User profile validation
    public static boolean validateUserProfile(String firstName, String lastName, String phoneNo, String dob, String email, String gender, String password) {
        boolean isValid = true;

        if (firstName == null || firstName.length() < 3) {
            isValid = false;
        }

        if (lastName == null && lastName.length() < 1) {
            isValid = false;
        }

        if (phoneNo == null &&phoneNo.length() != 10) {
            isValid = false;
        }

        if (dob == null) {
            isValid = false;
        }

        if (email == null &&!email.contains("@")) {
            isValid = false;
        }

        if (gender == null && (!gender.equalsIgnoreCase("Male") && !gender.equalsIgnoreCase("Female") && !gender.equalsIgnoreCase("Other"))) {
            isValid = false;
        }

        if (password == null && password.length() < 6) {
            isValid = false;
        }

        return isValid;
    }
}
