class CalculatorRunner3 {
    public static void main(String operations[]) {
        int number = 90;
        int anotherNumber = 415;

        // Invoking multiplication method of Calculator3
        int product = Calculator3.multiply(number, anotherNumber);
        System.out.println("The Multiplication of " + number + " and " + anotherNumber + " is: " + product);
    }
}
