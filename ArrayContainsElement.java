public class ArrayContainsElement {
    public static void main(String[] args) {
        int[] array = {1, 1, 5, 6, 5, 3, 8, 1, 9, 2, 8};
        int result = count(array, 1);
        System.out.println(result);
    }

    static int count(int[] a, int element) {
        int count = 0;
        for (int value : a) {
            if (value == element) {
                count++;
            }
        }
        return count;
    }
}

