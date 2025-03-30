// Time Complexity: O(n) where n is the number of elements in the array
// Space Complexity: O(n) where n is the number of elements in the array
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int arrayPairSum(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int num: nums){
            min = Math.min(min, num);
            max = Math.max(max, num);

            map.put(num, map.getOrDefault(num, 0)+1);
        }

        boolean pick = true;
        int sum = 0;

        for(int i = min; i <= max; i++){
            if(!map.containsKey(i)){
                continue;
            }

            int count = map.get(i);

            // always pick pairs and pick flag is not impacted
            sum += (i * (count/2));

            // if(count%2 == 1 && pick){
            //     sum += i;
            // }

            // Now, if count is odd, handle the extra element
            if (count % 2 == 1) {
                if (pick) {
                    sum += i;  // Add the extra element
                }
                // Toggle the pick flag for the next odd element
                pick = !pick;
            }
        }

        return sum;
    }
}