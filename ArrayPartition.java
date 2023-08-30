// Time Complexity : O(2n) -> O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes

package org.example;

import java.util.HashMap;

public class ArrayPartition {
    public int arrayPairSum(int[] nums) {
        int result = 0;
        /*Arrays.sort(nums);  // O(n log n)

        for(int i=0; i<nums.length; i=i+2) // O(n)
        {
            result += nums[i];
        }*/
        HashMap<Integer, Integer> map = new HashMap<>();  // bucket sort is best only when the input range is small
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        boolean flag = false;
        for(int i=0; i<nums.length; i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            max = Math.max(max,nums[i]);
            min = Math.min(min,nums[i]);
        }
        for(int i=min; i<=max; i++)
        {
            if(map.containsKey(i))
            {
                if(flag){
                    map.put(i,map.get(i)-1);
                }
                int cnt = map.get(i);
                result += cnt/2 * i;

                if(cnt % 2 == 0)
                {
                    flag = false;
                }else{
                    flag = true;
                    result += i;
                }
            }
        }
        return result;
    }
}
