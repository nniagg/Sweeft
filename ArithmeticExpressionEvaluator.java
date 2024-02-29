import java.util.Scanner;

public class ArithmeticExpressionEvaluator {

    public static int evaluateExpression(String expression) {
        // Split the expression based on arithmetic operators (+ and -),
        // but keep the operators as part of the result array
        String[] elements = expression.split("(?=[+-])|(?<=[+-])");

        // Initialize the result with the first operand
        int result = 0;
        int currentNumber = 0;
        char operation = '+';

        // Iterate through the elements and perform the operations
        for (String element : elements) {
            // If it's an operator, update the operation
            if (element.equals("+") || element.equals("-")) {
                operation = element.charAt(0);
            } else {
                // Parse the number from the element
                int number = Integer.parseInt(element);

                // Perform the operation based on the operator
                if (operation == '+') {
                    result += currentNumber;
                    currentNumber = number;
                } else if (operation == '-') {
                    result += currentNumber;
                    currentNumber = -number;
                }
            }
        }

        // Add the last number to the result
        result += currentNumber;

        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter arithmetic expression (or 'exit' to quit): ");
            String expression = scanner.nextLine();
            if (expression.equalsIgnoreCase("exit")) {
                System.out.println("Exiting...");
                break;
            }
            int result = evaluateExpression(expression);
            System.out.println("Result: " + result);
        }
        scanner.close();
    }
}
