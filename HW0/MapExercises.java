import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;

public class MapExercises {
    public static TreeMap<Character,Integer> letterToNum(){
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        TreeMap<Character,Integer> map = new TreeMap<>();
        for (int i=1;i<=26;i++){
            map.put(alphabet[i-1],i);
        } 
        return map;
    }
    public static TreeMap<Integer,Integer> squares(List<Integer> nums){
        TreeMap<Integer,Integer> squaremap = new TreeMap<>();
        for (int num : nums){
            squaremap.put(num,num*num);
        }
        return squaremap;
    }
    public static TreeMap<String,Integer> countWords(List<String> words){
        TreeMap<String,Integer> wordmap = new TreeMap<>();
        for (String word : words){
            if (wordmap.containsKey(word)){
                wordmap.put(word,wordmap.get(word)+1);
            }
            else{
                wordmap.put(word,1);
            }
        }
        return wordmap;
    }
    public static void main(String[] args) {
        System.out.println(letterToNum());
        System.out.println(squares(new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10))));
        ArrayList<String> wordlist = new ArrayList<>(Arrays.asList("pig","pig","happy","happy","pig"));
        TreeMap<String,Integer> countmap = countWords(wordlist);
        System.out.println(countmap);
    }
}
