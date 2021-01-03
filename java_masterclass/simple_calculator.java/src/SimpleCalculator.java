import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        double input1;
        double input2;

        System.out.print("Enter a numeric value: ");
        input1 = scanner.nextDouble();

        System.out.print("Enter a second numeric value: ");
        input2 = scanner.nextDouble();

        System.out.println("The first number divided by the second is: " + (input1 / input2));
    }
}