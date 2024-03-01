public class ArrayMerge {
    public static int[][] mergeArrays(int[][] arrayA, int[][] arrayB){
        int rows = arrayA.length;
        int colsA = arrayA[0].length;
        int colsB = arrayB[0].length;

        int[][]resultArray = new int[rows][colsA + colsB];

        for (int i=0; i < rows; i++){
            System.arraycopy(arrayA[i], 0, resultArray[i], 0, colsA);
            System.arraycopy(arrayB[i], 0, resultArray[i], colsA, colsB);
        }

        return resultArray;
    }

    public static void main(String[] args) {
        int[][] arrayA = {
            {1,2,3,4},
            {5,6,7,8},
            {9,1,2,3}
        };

        int[][] arrayB = {
            {9,8,7,6},
            {5,4,3,2},
            {1,9,8,7}
        };

        int[][] result = mergeArrays(arrayA, arrayB);

        for(int i = 0 ; i < result.length ; i++){
            for (int j = 0; j < result[i].length ; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
