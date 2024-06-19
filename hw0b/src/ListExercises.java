import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExercises {

    /** Returns the total sum in a list of integers */
	public static int sum(List<Integer> L) {
        // TODO: Fill in this function.
        if (L.isEmpty()) {
            return 0;
        }
        int s = 0;
        for(int i = 0; i < L.size(); i++){
            s += L.get(i);
        }
        return s;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        // TODO: Fill in this function.
        List<Integer> newlist = new ArrayList<>();
        for(int i = 0; i < L.size(); i++){
            if (i % 2 == 1) {
                newlist.add(L.get(i));
            }
        }
        return newlist;
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        // TODO: Fill in this function.
        List<Integer> commonList = new ArrayList<>();

        for(Integer num : L1){
            if(L2.contains(num)){
                commonList.add(num);
            }
        }
        return commonList;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        int count = 0;
        for(String word : words){
            for(int i = 0; i < word.length(); i++){
                if(word.charAt(i) == c){
                    count ++;
                }
            }
        }
        return  count;
    }
}
