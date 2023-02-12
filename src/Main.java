import java.util.*;
import java.util.stream.Stream;

public class Main {


    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        return res;
    }

    public static void main(String[] args) {
        Map<String, List<String>> map = new HashMap<>();
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        String[] strs2 = new String[strs.length];

        for (int i = 0; i < strs.length; i++) {

            char[] sortedString = strs[i].toCharArray();
            Arrays.sort(sortedString);
           // strings.add(String.valueOf(sortedString));
           // System.out.println(strings);
            String elem = String.valueOf(sortedString);
            map.put(elem,new ArrayList<>());
        }
        for (int i = 0; i < strs.length; i++) {

            char[] sortedString = strs[i].toCharArray();
            Arrays.sort(sortedString);
            strs2[i] = String.valueOf(sortedString);
        }

        for (String s :map.keySet()) {
            for (int j = 0; j < strs.length; j++) {
                if(s.equals(strs2[j])){
                    map.computeIfAbsent(s, k ->new ArrayList<>()).add(strs[j]);
                }
            }
        }




        System.out.println(map);

    }





}