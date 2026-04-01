import java.util.Scanner;

public class Calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Enter operator (+, -, *, /, %):");
        char op = sc.next().charAt(0);

        switch(op) {
            case '+':
                System.out.println("Sum = " + (a + b));
                break;

            case '-':
                System.out.println("Difference = " + (a - b));
                break;

            case '*':
                System.out.println("Product = " + (a * b));
                break;

            case '/':
                if(b != 0)
                    System.out.println("Division = " + (a / b));
                else
                    System.out.println("Cannot divide by zero");
                break;

            case '%':
                if(b != 0)
                    System.out.println("Remainder = " + (a % b));
                else
                    System.out.println("Cannot find remainder");
                break;

            default:
                System.out.println("Invalid operator");
        }
    }
}