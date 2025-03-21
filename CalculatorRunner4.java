class CalculatorRunner4 {
    public static void main(String operations[]) {
        int number = 90;
        int anotherNumber = 415;

        // Invoking modulus method of Calculator4
        int remainder = Calculator4.modulus(number, anotherNumber);
        System.out.println("The Modulus of " + number + " and " + anotherNumber + " is: " + remainder);
    }
}