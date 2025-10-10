import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ListExercises {
    public static int sum(List<Integer> lst){
        if (lst.size() == 0){
            return 0;
        }
        int total = 0;

        for(int i:lst){
            total = total + i;
        }
        return total;
    }

    public static List<Integer> even(List<Integer> lst){
        List<Integer> evenlst = new ArrayList<>();
        for (int ele:lst){
            if (ele%2==0){
                evenlst.add(ele);
            }
        }
        return evenlst;
    }
    public static boolean has(List<Integer> L,int a ){
        for (int ele: L){
            if (ele==a){
                return true;
            }
        }
        return false;
    }
    public static List<Integer> common(List<Integer> L1, List<Integer> L2){
    /**write a very slow method before learning great datastructures */
        List<Integer> common = new ArrayList<>();
        for (int ele1 : L1){
            if (has(common,ele1)){
                continue;
            }
            if (has(L2,ele1)){
                common.add(ele1);
            }
        }
        return common;
    }

    public static int countOccurrencesOfC(List<String> words,char c){
        int total = 0;
        for (String word : words){
            char[] word_Array = word.toCharArray();
            for (char i : word_Array){
                if(i == c){
                    total = total + 1;
                }
            }
        }
        return total;
    }
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> l2 = new ArrayList<>(Arrays.asList(6,8));
        int s = sum(l1);
        System.out.println(s);
        List<Integer> evenlst = even(l2);
        System.out.println(evenlst);
        System.out.println(common(l1,l2));
        List<String> wordlist = new ArrayList<>(Arrays.asList("happy","pig"));
        char c = 'p';
        System.out.println(countOccurrencesOfC(wordlist, c));
    }
}