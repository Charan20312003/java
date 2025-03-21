class CalculatorRunner1 {
    public static void main(String operations[]) {
        int number = 90;
        int anotherNumber = 415;

        // Invoking methods of Calculator
        int sum = Calculator.add(number, anotherNumber);
        System.out.println("The Addition of " + number + " and " + anotherNumber + " is: " + sum);
}
}