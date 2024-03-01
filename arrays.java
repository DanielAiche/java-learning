public class arrays {
    public static void main(String[] args) {
        
        int[][] nums = new int[8][8];


        int k = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = 0;j < nums[i].length; j++){
                nums[i][j] = k++;
            }
        }
        for(int i = 0; i < nums.length; i++){
            for(int j = 0;j < nums[i].length; j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
