/*
 * tc - o(n + range)
 * sc- 0(1)
 */

import java.util.Arrays;

public class arrayPartition {
     //n + range
    // public int arrayPairSum(int[] nums) {
    //     int n = nums.length;
    //     Map<Integer, Integer> map = new HashMap<>();
    //     int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
    //     for(int i: nums){
    //         map.put(i, map.getOrDefault(i,0)+1);
    //         min = Math.min(min, i);
    //         max = Math.max(max, i);
    //     }
    //     boolean flag= false;
    //     int result = 0;
    //     for(int i = min; i<=max ;i++){
    //         if(!map.containsKey(i)){
    //             continue;
    //         }
    //         if(flag){
    //             //to reduce frq 
    //             map.put(i, map.get(i)-1);
    //             flag = false;
    //         }
    //         int frq = map.get(i);
    //         if(frq % 2 == 0){
    //             result += frq/2 * i;
    //         }else{
    //             result += frq/2 * i + i;
    //             flag =true;
    //         }
    //     }
    //     return result;
    // }

    //nlogn + n 
    public int arrayPairSum(int[] nums) {
        int n = nums.length-1;
        Arrays.sort(nums);
        int result = 0;
        for(int i = 0; i <= n; i+= 2){
            result += nums[i];
        }
        return result;
    }
}
