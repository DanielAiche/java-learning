import java.util.Scanner;

public class GoldenRatio {
    public static void main(String[] args) {
        System.out.print("Enter two numbers: ");

        Scanner scan = new Scanner(System.in);
        double a, b;

        if (scan.hasNextDouble()) {
            a = scan.nextDouble();
        } else {
            System.out.println("Invalid input.");
            scan.close();
            return;
        }

        if (scan.hasNextDouble()) {
            b = scan.nextDouble();
        } else {
            System.out.println("Invalid input.");
            scan.close();
            return;
        }

        double ratio1 = a / b;
        double ratio2 = b / a;
        double goldenRatio = 1.618;

        // Check if the ratios are approximately equal with up to 3 decimal points precision
        if (Math.abs(ratio1 - goldenRatio) < 0.001) {
            System.out.println("\nGolden ratio!");
        } else if (Math.abs(ratio2 - goldenRatio) < 0.001) {
            System.out.println("\nGolden ratio!");
        } else {
            System.out.println("\nMaybe next time.");
        }

        scan.close(); // close the scanner
    }
}