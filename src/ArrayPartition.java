import java.util.HashMap;

/**
 * 
 */

/**
 * @author Aditya Sinha
 * count how many times each number appears using a frequency bucket (array)
 * iterate from the smallest to largest number, pairing elements and skipping every second item.
 * By always taking the smaller of each pair, we maximize the total of minimums.
 *
 * Time Complexity - O(n) + O(min to max)
 * Space Complexity - O(n)
 */
public class ArrayPartition {
	public int arrayPairSum(int[] nums) {
        int result = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        boolean flag = false;

        for(int i=min; i<=max; i++){
            if(!map.containsKey(i)) continue;
            if(flag){
                map.put(i, map.get(i)-1);
            }

            int frq = map.get(i);
            if(frq % 2 == 0){
                result += frq/2 * i;
                flag = false;
            }else{
                result += frq/2 * i;
                result += i;
                flag = true;
            }
        }
        
        return result;
    }
}
