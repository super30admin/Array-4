//The idea here is to implement bucket sort for in the given range of numbers for O(n) time complexity
//We maintain a flag to consider the elements in a alternate way
//When we have flag as true we don't consider that element and reduce it's count by 1 and make it true
//When flag is true, we check if we have even or odd count. If even count, we include half of them in the result
//if odd, we consider one extra to and make flag true 
//Time Complexity: O(n)
//Space Complexity:O(n)
import java.util.HashMap;

class Solution {
    public int arrayPairSum(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length; i++){
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        boolean flag = false;
        int result = 0;
        for(int i = min; i<=max; i++){
            if(!map.containsKey(i)) continue;
            if(flag){
                map.put(i, map.get(i)-1);
                flag = false;
            }
            int fr = map.get(i);
            if(fr%2 == 0){
                result += (fr/2) * i;                
            } else {
                result += (fr/2) * i;
                result += i;
                flag = true;
            }
        }
        return result;
    }
}