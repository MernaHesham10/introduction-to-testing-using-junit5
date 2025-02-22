package calculator_application;

public class main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int firstNumber = 10, secondNumber = 5;

        System.out.println("Add 2 numbers: " + firstNumber + " + " + secondNumber + " = " + calculator.add(10, 5));

        System.out.println("Subtract 2 numbers: " + firstNumber + " - " + secondNumber + " = " + calculator.subtract(10, 5));

        System.out.println("Multiply 2 numbers: " + firstNumber + " * " + secondNumber + " = " + calculator.multiply(10, 5));

        System.out.println("Divide 2 numbers: " + firstNumber + " / " + secondNumber + " = " + calculator.divide(10, 5));
    }
}