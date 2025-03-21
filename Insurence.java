class Insurence {

    public static double search(String insurenceName) {
        double termPrice = 0.00;

        if (insurenceName.equalsIgnoreCase("hdfc")) {
            termPrice = 9000.99;
        } else if (insurenceName.equalsIgnoreCase("lic")) {
            termPrice = 8000.99;
        } else if (insurenceName.equalsIgnoreCase("starhealth life insurance")) {
            termPrice = 88880.99;
        } else if (insurenceName.equalsIgnoreCase("auysh mhan Jeeva veema")) {
            termPrice = 55555.99;
        } else if (insurenceName.equalsIgnoreCase("SBI Life Insurance")) {
            termPrice = 92220.99;
        } else if (insurenceName.equalsIgnoreCase("icic Life Insurance")) {
            termPrice = 92120.99;
        } else if (insurenceName.equalsIgnoreCase("axixs max Life Insurance")) {
            termPrice = 4444.44;
        } else if (insurenceName.equalsIgnoreCase("karnataka bank Life Insurance")) {
            termPrice = 33333.44;
        } else if (insurenceName.equalsIgnoreCase("white gold Life Insurance")) {
            termPrice = 7777.90;
        } else if (insurenceName.equalsIgnoreCase("Tata AIA Life Term Life Insurance")) {
            termPrice = 1224.44;
        } else {
            System.out.println("Insurance not found!");
        }

        return termPrice;
    }
}
