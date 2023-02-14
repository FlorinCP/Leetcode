import java.util.*;
import java.util.stream.Stream;

public class Main {


    public static void main(String[] args) {
        int k=2;
        int [] nums ={1,1,1,2,2,3};
        int answer[] = new int[k];
       HashMap<Integer,Integer> hashMap = new HashMap<>();
       // hmap key -> numarul si value -> conut
        // priority queue to sort , implementarea heap ului
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->Integer.compare(hashMap.get(a),hashMap.get(b)));

        // aici populam hm si get or Default e foarte jmekera metoda , daca e prima inserare pune 0 , daca nu valoarea precedenta +1
        for (int i:nums) {
            hashMap.put(i, hashMap.getOrDefault(i,0)+1);
        }

        for (Integer i : hashMap.keySet()) {
            pq.add(i);

            if(pq.size()>k){
                pq.poll();
            }
        }

        for (int i = 0; i < k; i++) {
            answer[i] = pq.poll();
        }

    }


}