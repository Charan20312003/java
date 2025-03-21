class CalculatorRunner2 {
    public static void main(String operations[]) {
        int number = 90;
        int anotherNumber = 415;

        // Invoking subtraction method of Calculator2
        int difference = Calculator2.subtract(number, anotherNumber);
        System.out.println("The Subtraction of " + number + " and " + anotherNumber + " is: " + difference);
    }
}
