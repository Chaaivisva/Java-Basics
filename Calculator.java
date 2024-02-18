import java.util.Scanner;

abstract class Operation {
    double a, b;

    Operation(double a, double b) {
        this.a = a;
        this.b = b;
    }

    abstract double operation();
}

class Addition extends Operation {
    Addition(double a, double b) {
        super(a, b);
    }

    double operation() {
        return a + b;
    }
}

class Subtraction extends Operation {
    Subtraction(double a, double b) {
        super(a, b);
    }

    double operation() {
        return a - b;
    }
}

class Multiplication extends Operation {
    Multiplication(double a, double b) {
        super(a, b);
    }

    double operation() {
        return a * b;
    }
}

class Division extends Operation {
    Division(double a, double b) {
        super(a, b);
    }

    double operation() {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }
}

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter operation (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        Operation operation;

        switch (operator) {
            case '+':
                operation = new Addition(num1, num2);
                break;
            case '-':
                operation = new Subtraction(num1, num2);
                break;
            case '*':
                operation = new Multiplication(num1, num2);
                break;
            case '/':
                operation = new Division(num1, num2);
                break;
            default:
                System.out.println("Invalid operation");
                return;
        }
        try {
            System.out.println("Result: " + operation.operation());
        } 
        catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed.");
        }
    }
}