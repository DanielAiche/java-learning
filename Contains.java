public class Contains {
    public static boolean contains(int[] a, int element) {
        
        //null reference check
        if (a == null){
            return false;
        }


        for(int i=0; i < a.length; i++) {
            for(int j = a[i], k= 0; j == element; k++)
            if(k == 1){
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        
        int[] array = {1,1,5,5,5,3,8,1};

        boolean result = contains(array, 5);
        System.out.println(result);
    }
}
