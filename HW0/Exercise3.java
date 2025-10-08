public class Exercise3 {
    /** Returns the maximum value from m. */
    public static int more(int a, int b){
        if (a > b){
            return a;
        }
        else {
            return b;
        }
    }
    public static int max(int[] m) {
        int result = m[0];
        for(int t=1; t < m.length; t++){
            result = more(result,m[t]);
        }
        return result;
    }
    public static void main(String[] args) {
       int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
       System.out.println(max(numbers));    
    }
}