import java.util.*;
import java.util.stream.Stream;

public class Main {


    public static void main(String[] args) {
        int k=2;
        int [] nums ={1,1,1,2,2,3};
        // Aici adaugam valorile in hashmap
       Map<Integer,Integer> bucket = new HashMap<>();
        for (int num:nums) {
            // metoda consacrata de a adauga mai multe valori
            bucket.put(num,bucket.getOrDefault(num,0)+1);
        }
        System.out.println(bucket);

        // Aici am schimbat valorile de la o galeata la alta
        Map<Integer,List> bucket2 = new HashMap<>();
        for (Integer i: bucket.keySet()) {
            Integer elemFreq = bucket.get(i);
            if(!bucket2.containsKey(elemFreq)){
                bucket2.put(elemFreq,new ArrayList<>());
            }
            bucket2.get(elemFreq).add(i);
        }

        System.out.println(bucket2);

        // Acum luam elementele de sus 
        int[] result = new int[k];
        // Stim ca lugimea array-ului este maximul de frecventa pe care il avem
        for (int i = nums.length; i>0 ; i--) {
            if(bucket2.containsKey(i)){
                // aici punem intr un array elementele pt care avem frecventa respectiva , pt ca putem avea mai multe elemente cu aceiasi frecventa
                List<Integer> list = bucket2.get(i);
                for (Integer j: list) {
                    result[--k]=j;
                    if(k==0){
                        return result;
                    }
                }
            }
            
        }







    }


}