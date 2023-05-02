//time complexity: O(N) where N is the length of array
//space complexity: O(N)
import  java.util.*;
public class ArrayPartition {
    static int arrayPairSum(int[] nums) {
        int n = nums.length;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums) {
            min = Math.min(min, i);
            max = Math.max(max, i);
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int res = 0;
        boolean flag = true;
        for(int i = min; i <= max; i++) {
            if(!map.containsKey(i)) continue;
            if(!flag) {
                map.put(i, map.get(i) - 1);
                flag = !flag;
            }
            int freq = map.get(i);
            if(freq % 2 == 0) {
                res +=  i*(freq/2);
                flag = true;
            } else {

                res += i*(freq/2);
                res += i;
                flag = false;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {6,2,6,5,1,2};
        System.out.println("Array: " + Arrays.toString(nums));
        System.out.println("Pair Sum is:" + arrayPairSum(nums));
    }
}
