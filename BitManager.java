import java.util.Scanner;

public class BitManager {
    private static String bitSequence;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Bitlandia!");
        System.out.print("Initial bit configuration: ");
        bitSequence = scanner.nextLine().trim();

        System.out.println("Please enter a command (check <string>, change <index> <state>, or exit):");

        while (true) {
            String command = scanner.nextLine().trim();

            if (command.startsWith("check")) {
                checkBits(command.substring(6).trim());
            } else if (command.startsWith("change")) {
                changeBitState(command.substring(7).trim());
            } else if (command.equals("exit")) {
                System.out.println("Exiting program. Goodbye!");
                break;
            } else {
                System.out.println("Invalid command. Please try again.");
            }
        }

        scanner.close();
    }

    private static void checkBits(String bitsToCheck) {
        int naughtyCount = 0;
        for (int i = 0; i < bitsToCheck.length(); i++) {
            if (bitsToCheck.charAt(i) == '1' && bitSequence.charAt(i) == '1') {
                naughtyCount++;
            }
        }
        if (naughtyCount > 0) {
            System.out.println("Contains Naughty Bits");
        } else {
            System.out.println("No Naughty Bits Found");
        }
    }

    private static void changeBitState(String changeCommand) {
        String[] parts = changeCommand.split(" ");
        int index = Integer.parseInt(parts[0]) - 1;
        String state = parts[1];

        if (state.equals("naughty")) {
            System.out.println("Bit at index " + (index + 1) + " marked as Naughty");
            bitSequence = bitSequence.substring(0, index) + "1" + bitSequence.substring(index + 1);
        } else if (state.equals("good")) {
            System.out.println("Bit at index " + (index + 1) + " marked as Good");
            bitSequence = bitSequence.substring(0, index) + "0" + bitSequence.substring(index + 1);
        } else {
            System.out.println("Invalid state. Please try again.");
        }
    }
}
