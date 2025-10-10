import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaExercises {

    public static int[] makeDice(){
        return new int[]{1,2,3,4,5,6};
    }

    public static String[] takeOrder(String s){
        if (s.equals("Ergun")){
            return new String[] {"beyti", "pizza", "hamburger", "tea"};
        }
        if (s.equals("Erik")){
            return new String[] {"sushi", "pasta", "avocado", "coffee"};
        }
        else{
            return new String[3];
        }
    }
    public static int findMax(int[] array){
        int idx = 0;
        for (int i = 0; i<array.length; i++){
            if(array[idx]<array[i]){
                idx = i;
            }
        }
        return array[idx];
    }
    public static int findMin(int[] array){
        int idx = 0;
        for (int i = 0; i<array.length; i++){
            if(array[idx]>array[i]){
                idx = i;
            }
        }
        return array[idx];
    }
    
    public static int findMinMax(int[] array){
        return findMax(array)-findMin(array);
    }

    public static List<Integer> hailstone(int n){
        List<Integer> hailstone_seq = new ArrayList<Integer>();
        hailstone_seq.add(n);
        int last = hailstone_seq.get(hailstone_seq.size()-1);
        while(last != 1){
            if(last%2 == 0){
                hailstone_seq.add(last/2);
            }else{
                hailstone_seq.add(3*last+1);
            }
            last = hailstone_seq.get(hailstone_seq.size()-1);
        }
        return hailstone_seq;
    }
    public static void main(String[] args) {
        int N = 25;
        List<Integer> Sequence = hailstone(N);
        System.out.println(Sequence);
        System.out.println(Arrays.toString(makeDice()));
        System.out.println(findMinMax(makeDice()));
    }
}
