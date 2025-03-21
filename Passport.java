class PassPort
{
    public static String userRegistration(String location, String area, String firstName, String lastName, 
	String birthDate, String email, String isEmailSame, String userId, String password, String confirmPassword,
	String securityQuestion, String securityAnswer, String captcha) {
        String result = null;
        boolean isValid = validateUserProfile(location, area, firstName, lastName, birthDate, email, 
		isEmailSame, userId, password, confirmPassword, securityQuestion, securityAnswer, captcha);

        if (isValid) {
            result = "Registration successful!";
        } else {
            result = "Registration failed. Please try again.";
        }
        return result;
    }

    public static boolean validateUserProfile(String location, String area, String firstName, String lastName, 
	String birthDate, String email, String isEmailSame, String userId, String password, String confirmPassword,
	String securityQuestion, String securityAnswer, String captcha) {
        boolean isValid = false;
        boolean isLocationValid = false;
        boolean isAreaValid = false;
        boolean isFirstNameValid = false;
        boolean isLastNameValid = false;
        boolean isBirthDateValid = false;
        boolean isEmailValid = false;
        boolean isEmailSameValid = false;
        boolean isUserIdValid = false;
        boolean isPasswordValid = false;
        boolean isConfirmPasswordValid = false;
        boolean isSecurityQuestionValid = false;
        boolean isSecurityAnswerValid = false;
        boolean isCaptchaValid = false;

        if (location != null && !location.isEmpty()) {
            isLocationValid = true;
        }

    
        if (area != null && !area.isEmpty()) {
            isAreaValid = true;
        }

        if (firstName !=null && firstName.length()>=3 && !firstName.isEmpty()) {
            isFirstNameValid = true;
        }

        if (lastName != null && lastName.length()>=1 && !lastName.isEmpty()) {
            isLastNameValid = true;
        }
        if (birthDate != null && !birthDate.isEmpty() ) {
            isBirthDateValid = true;
        }
        if (email != null && !email.isEmpty() ) {
            isEmailValid = true;
        }
        if (isEmailSame.equals("false")) {
            isEmailSameValid = true;
        }
        if (userId != null && !userId.isEmpty()) {
            isUserIdValid = true;
        }
        if (password != null && password.length() >= 6 && !password.isEmpty()) {
            isPasswordValid = true;
        }
        if (confirmPassword != null && confirmPassword==password) {
            isConfirmPasswordValid = true;
        }

        if (securityQuestion != null) {
            isSecurityQuestionValid = true;
        }

        if (captcha != null ) {
            isCaptchaValid = true;
        }

        if (isLocationValid==true && isAreaValid==true && isFirstNameValid==true && isLastNameValid ==true&& 
		isBirthDateValid ==true&& isEmailValid==true && isEmailSameValid==true && isUserIdValid==true && 
		isPasswordValid ==true&& isConfirmPasswordValid ==true&& isSecurityQuestionValid==true && 
		isSecurityAnswerValid==true && isCaptchaValid==true)
		{
           return isValid = true;
        }

        return isValid;
}
}