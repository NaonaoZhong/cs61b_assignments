public class Exercise4 {
  public static void windowPosSum(int[] a, int n) {
    /** your code here */ 
    for(int i=0; i<a.length; i++){
        if(a[i]>0){
            if(i+n <= a.length-1){  
                int sum=0;          
                for(int s=0; s<=n; s++){
                sum=sum+a[i+s];
                }
            a[i]=sum;
            }
            else{
                int sum=0;
                for(int s=0; s < a.length-i; s++){
                    sum=sum+a[i+s];
                }
                a[i]=sum;
            }
        }
        else{
            continue;
        }
    }
  }

  public static void main(String[] args) {
    int[] a = {1, 2, -3, 4, 5, 4};
    int n = 3;
    windowPosSum(a, n);

    // Should print 4, 8, -3, 13, 9, 4
    System.out.println(java.util.Arrays.toString(a));
  }
}