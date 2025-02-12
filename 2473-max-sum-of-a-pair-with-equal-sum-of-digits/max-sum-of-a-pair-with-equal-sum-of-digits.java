import java.util.HashMap;

class Solution {
    public int maximumSum(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxi = -1;
        
        for (int num : nums) {
            int sum = dsum(num);
            
            if (map.containsKey(sum)) {
                maxi = Math.max(maxi, num + map.get(sum));
                map.put(sum, Math.max(map.get(sum), num));
            } else {
                map.put(sum, num);
            }
        }
        
        return maxi;
    }

    private int dsum(int a) {
        int sum = 0;
        while (a > 0) {
            sum += a % 10;
            a /= 10;
        }
        return sum;
    }
}
