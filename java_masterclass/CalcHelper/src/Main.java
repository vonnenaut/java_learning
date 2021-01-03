import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        double input1, input2;

        try {
            System.out.print("Enter a numeric value: ");
            input1 = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Enter a second numeric value: ");
            input2 = scanner.nextDouble();
            scanner.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Couldn't format as a number");
            return;
        }

        System.out.println("Select an operation (+ - * /): ");
        var operation = scanner.nextLine();

        double result;

        switch (operation) {
            case "+":
                result = com.company.CalcHelper.addValues(input1, input2);
                break;
            case "-":
                result = com.company.CalcHelper.subtractValues(input1, input2);
                break;
            case "*":
                result = com.company.CalcHelper.multiplyValues(input1, input2);
                break;
            case "/":
                result = com.company.CalcHelper.divideValues(input1, input2);
                break;
            default:
                System.out.println("No valid operator chosen! ( +, -, *, / )");
                return;
        }

        System.out.println(input1 + " " + operation + " " + input2 + " = " +
                result);
    }
}