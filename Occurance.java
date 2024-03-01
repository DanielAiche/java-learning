import java.util.Scanner;

public class Occurance {
    public static void main(String[] args) {
        //Create scanner object -> read input
        Scanner scan = new Scanner(System.in);

        //prompt user
        System.out.print("Enter a string: ");
        String inputString = scan.nextLine();

        scan.close();

        displayoccurences(inputString);
    }

    private static void displayoccurences(String inputString) {
        int[] digits = new int[10];

        for(char ch : inputString.toCharArray()) {
            if (Character.isDigit(ch)) {
                int digit = Character.getNumericValue(ch);
                digits[digit]++;
            }
        }

        for (int i = 0; i <= 9; i++) {
            System.out.println(i + ": " + digits[i]);
        }
    }
}
