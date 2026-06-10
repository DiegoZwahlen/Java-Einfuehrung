import java.util.Scanner;

public class Calculator {
    private static final String RESET = "\u001B[0m";
    private static final String CYAN = "\u001B[36m";
    private static final String GREEN = "\u001B[32m";
    private static final String YELLOW = "\u001B[33m";
    private static final String RED = "\u001B[31m";
    private static final String PURPLE = "\u001B[35m";
    private static final String BOLD = "\u001B[1m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        printBanner();

        while (true) {
            System.out.println(CYAN + "\n══ Type " + YELLOW + "'exit'" + CYAN + " anytime as the first input to quit ══" + RESET);
            System.out.print(PURPLE + " Enter first number: " + RESET);
            String input = scanner.next();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            double num1 = Double.parseDouble(input);

            System.out.print(PURPLE + " Enter second number: " + RESET);
            double num2 = scanner.nextDouble();

            System.out.print(PURPLE + " Choose operator " + YELLOW + "(+, -, *, /, %)" + PURPLE + ": " + RESET);
            char operator = scanner.next().charAt(0);

            double result;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        printError("Division by zero is not allowed.");
                        continue;
                    }
                    break;
                case '%':
                    result = num1 % num2;
                    break;
                default:
                    printError("Invalid operator.");
                    continue;
            }

            printResult(num1, num2, operator, result);
        }

        scanner.close();
        System.out.println(GREEN + "\n══ Calculator closed. Goodbye! ══" + RESET);
    }

    private static void printBanner() {
        System.out.println(CYAN + BOLD);
        System.out.println("╔════════════════════════════════════╗");
        System.out.println("║           JAVA CALCULATOR          ║");
        System.out.println("╚════════════════════════════════════╝");
        System.out.println(RESET);
    }

    private static void printResult(double num1, double num2, char operator, double result) {
        System.out.println(GREEN + BOLD);
        System.out.println("╔════════════════════════════════════╗");
        System.out.println("║               RESULT               ║");
        System.out.println("╚════════════════════════════════════╝");
        System.out.printf(" %.2f %c %.2f = %.2f%n", num1, operator, num2, result);
        System.out.println(RESET);
    }

    private static void printError(String message) {
        System.out.println(RED + BOLD);
        System.out.println("╔════════════════════════════════════╗");
        System.out.println("║                ERROR               ║");
        System.out.println("╚════════════════════════════════════╝");
        System.out.println(" " + message);
        System.out.println(RESET);
    }
}