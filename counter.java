public class counter {

    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        while (num1 <= num2) {
            System.out.println(num1);
            num1++;
        }
    }
}