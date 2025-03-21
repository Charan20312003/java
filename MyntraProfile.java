class MyntraProfile {

    public static String signUp(String firstName, String lastName, String phoneNo, String dob, String mailId, String gender, String password, String enteredCaptcha) {
        String ref = null;

        if (validateUserProfile(firstName, lastName, phoneNo, dob, mailId, gender, password, enteredCaptcha)) {
            ref = "User Signup Successful! Welcome to Myntra.";
        } else {
            ref = "User Signup Failed. Please check details.";
        }

        return ref;
    }

    public static void signIn(String phoneNumber, String password) {
        if (password.length() >= 6) {
            System.out.println("User signed in successfully with phone number: " + phoneNumber);
        } else {
            System.out.println("Sign-in failed! Invalid password.");
        }
    }

    // Validate User Profile
    public static boolean validateUserProfile(String firstName, String lastName, String phoneNo, String dob, String mailId, String gender, String password, String enteredCaptcha) {
        if (firstName == null && firstName.length() < 3) {
            System.out.println("Invalid First Name.");
            return false;
        }
        if (lastName == null && lastName.length() < 1) {
            System.out.println("Invalid Last Name.");
            return false;
        }
        if (phoneNo == null && phoneNo.length() != 10) {
            System.out.println("Invalid Phone Number.");
            return false;
        }
        if (dob == null) {
            System.out.println("Invalid Date of Birth.");
            return false;
        }
        if (mailId == null &&!mailId.contains("@")) {
            System.out.println("Invalid Email.");
            return false;
        }
        if (gender == null && !(gender.equalsIgnoreCase("Male") || gender.equalsIgnoreCase("Female") || gender.equalsIgnoreCase("Other"))) {
            System.out.println("Invalid Gender.");
            return false;
        }
        if (password.length() < 6) {
            System.out.println("Password must be at least 6 characters.");
            return false;
        }
        if (!enteredCaptcha.equalsIgnoreCase("1234")) { // Fixed Captcha for simplicity
            System.out.println("Captcha verification failed!");
            return false;
        }

        return true;
    }
}
