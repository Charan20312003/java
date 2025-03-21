class PassPortRunner
{
    public static void main(String[] args) 
	{
        String registrationMessage=PassPort.userRegistration(
            " office", " abcdeff", "charan", "hj", "22/07/2003", "charan@gmail.com", "true", 
            "charan@gmail.com", "chan@123", "cherry@123", "boss", "cpcy", "abcdeff");
        System.out.println(registrationMessage);
}
}