class InsurenceRunner {
    public static void main(String[] args) {
        String insurenceName = "white gold Life Insurance";  

        double  price = Insurence.search(insurenceName);  

                   System.out.println("Thank you for choosing " + insurenceName + "!");
            System.out.println("Your term insurance price is: ₹" + price);
          }
}
		