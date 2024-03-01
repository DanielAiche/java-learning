public class Count {
    
    public static int count(int[] array, int element) {{
        if (array == null ){
            return 0;
        }
    }
        int k = 0;

        for(int i = 0;i < array.length;i++) {
            if(array[i] == element) {
                k++;
            }
        }
        
        return k;
    }
    public static void main(String[] args) {

        int[] array = {1,1,5,6,5,3,8,1,9,2,8};
        int result = count(array, 8);
        System.out.println(result);
        
    }
}