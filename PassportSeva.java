class PassportSeva {

    // Sign-up method
    public static String signUp(String firstName, String lastName, String phoneNo, String dob, String email, String gender, String password, String captchaInput) {
        String ref = null;
        
        // Dummy captcha for validation
        String generatedCaptcha = "AB123";
        
        boolean userIsValid = validateUserProfile(firstName, lastName, phoneNo, dob, email, gender, password, captchaInput, generatedCaptcha);
        
        if (userIsValid) {
            ref = "Passport Seva: User Signup Successful!";
        } else {
            ref = "Passport Seva: Signup Failed! Please check your details.";
        }

        return ref;
    }

    // Sign-in method
    public static void signIn(String email, String password) {
        System.out.println("User signed in successfully with email: " + email);
    }

    // User profile validation
    public static boolean validateUserProfile(String firstName, String lastName, String phoneNo, String dob, String email, String gender, String password, String captchaInput, String generatedCaptcha) {
        boolean isValid = true;

        if (firstName == null && firstName.length() < 3) {
            System.out.println("Invalid First Name. Minimum 3 characters required.");
            isValid = false;
        }

        if (lastName == null && lastName.length() < 1) {
            System.out.println("Invalid Last Name. Please provide a valid last name.");
            isValid = false;
        }

        if (phoneNo == null && phoneNo.length() != 10) {
            System.out.println("Invalid Phone Number. It should be exactly 10 digits.");
            isValid = false;
        }

        if (dob == null) {
            System.out.println("Invalid Date of Birth. Please provide a valid DOB.");
            isValid = false;
        }

        if (email == null && !email.contains("@")) {
            System.out.println("Invalid Email. Please provide a valid email.");
            isValid = false;
        }

        if (gender == null && (!gender.equalsIgnoreCase("Male") && !gender.equalsIgnoreCase("Female") && !gender.equalsIgnoreCase("Other"))) {
            System.out.println("Invalid Gender. Choose Male, Female, or Other.");
            isValid = false;
        }

        if (password == null && password.length() < 6) {
            System.out.println("Invalid Password. Minimum 6 characters required.");
            isValid = false;
        }

        if (!captchaInput.equals(generatedCaptcha)) {
            System.out.println("Captcha verification failed.");
            isValid = false;
        }

        return isValid;
    }
}
