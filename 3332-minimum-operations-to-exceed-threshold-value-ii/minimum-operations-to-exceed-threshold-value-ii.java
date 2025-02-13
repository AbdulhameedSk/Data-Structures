import java.util.PriorityQueue;

class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for (int num : nums) {
            pq.offer((long) num); 
        }
        int c = 0;

        while (pq.size() > 1 && pq.peek() < k) {
            long min1 = pq.poll();
            long min2 = pq.poll();
            pq.offer((min1 * 2) + min2);
            c++;
        }
        
        return pq.peek() >= k ? c : -1;
    }
}
