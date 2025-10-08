public class DrawTriangle{
    public static void drawtriangle(int N){
        int t=1;
        while(t < N+1){
            for(int i=0; i<t; i++){
            System.out.print("*");  
            }
            System.out.println();
            t++;
        }
    }
    public static void main(String[] args){
        drawtriangle(10);
        }
}