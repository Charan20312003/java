public class Max {
    public static String signup(String firstName, String lastName, String gmailId, String phoneNumber, String gender) {
        boolean userValidate = validateUserProfile(firstName, lastName, gmailId, phoneNumber, gender);

        if (userValidate) {
            return "User is valid";
        } else {
            return "User is invalid";
        }
    }

    public static boolean validateUserProfile(String firstName, String lastName, String gmailId, String phoneNumber, String gender) {
        boolean isFirstName = false;
        boolean isLastName = false;
        boolean isGmailId = false;
        boolean isphoneNumber = false;
        boolean isGender = false;

        if (firstName != null && firstName.length() >= 3) {
            isFirstName = true;
        } else {
            System.out.println("First Name is invalid. It should have at least 3 characters.");
        }

        if (lastName != null && lastName.length() >= 3) {
            isLastName = true;
        } else {
            System.out.println("Last Name is invalid. It should have at least 3 characters.");
        }

        if (gmailId != null ) {
            isGmailId = true;
        } else {
            System.out.println("Invalid Gmail ID.");
        }

        if (phoneNumber != null) {
            isphoneNumber = true;
        } else {
            System.out.println("Invalid Phone Number. It should be a 10-digit number.");
        }

        if (gender != null ) {
            isGender = true;
        } else {
            System.out.println("Invalid Gender. It should be Male, Female, or Other.");
        }

        if (isFirstName && isLastName && isGmailId && isphoneNumber && isGender) {
            return true;
        } else {
            System.out.println("User validation failed.");
            return false;
        }
    }

   }
