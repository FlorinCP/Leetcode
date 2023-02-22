import java.util.*;


public class Function {

    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i:stones) {
            pq.add(i);
        }

        while(pq.size() >1) {
            var y = pq.poll();
            var x = pq.poll();

            if (x != y) {
                pq.add(y-x);
            }
        }

        if(pq.isEmpty())return 0;
        else return pq.peek();
    }
}
