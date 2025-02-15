import java.util.HashMap;
import java.util.Map;

class Solution {
    public int punishmentNumber(int n) {
        int[] numbers = {1, 9, 10, 36, 45, 55, 82, 91, 99, 100, 235, 297, 369, 370, 379, 414, 657, 675, 703, 756, 792, 909, 918, 945, 964, 990, 991, 999, 1000};

        Map<Integer, Double> sqrtMap = new HashMap<>();

        for (int num : numbers) {
            sqrtMap.put(num, Math.sqrt(num));
        }

        int ans = 0;
        for (int key : sqrtMap.keySet()) { 
            if (key <= n) { 
                ans += key*key; 
            }
        }

        return ans;
    }
}
