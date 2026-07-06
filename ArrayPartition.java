//Time Complexity: O(n) + O(minimum to maximum)
//Space Complexity: O(n)
import java.util.HashMap;
import java.util.Map;
public class ArrayPartition {
    public int arrayPairSum(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        //Find min & max, and update the map
        int min = nums[0];
        int max = nums[0];
        for(int i = 0; i < nums.length; i++) {
            min = Math.min(min,nums[i]);
            max = Math.max(max,nums[i]);
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        boolean flag = false;
        int sum = 0;
        for(int i = min; i<=max; i++) {
            if(!map.containsKey(i)) continue;
            int count = map.get(i);
            if(!flag) {
                sum = sum + i;
                flag = true;
                count--;
            }
            sum += (count/2)*i;
            if(count %2 != 0) {
                flag = false;
            }
            map.remove(i);
        }

        return sum;
    }
}
