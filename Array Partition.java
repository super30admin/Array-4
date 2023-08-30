// Time Complexity : O(nlogn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Your code here along with comments explaining your approach

// We can sort the numbers, so the gaps between the pairs get reduced as this ensures we get the maximum sum of their minimums. Starting from the first index, every alternate number will be the minimum in its respective pair.
// TC: O(nlogn)
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int result=0;
        for(int i=0;i<nums.length;i+=2)
        {
            result+=nums[i];
        }
        return result;
    }
}

//Bucket sort
// Bucket sort
// We need find the range of the numbers. Then store this in the hashmap with key as the numbers and value as its frequency. We will iterate through the hashmap to find the pairs. Frequecy / 2 will tell us how many pairs could be found. The remaining will be updated in the map. Once the pair is complete, hashmap is updated with 0
class Solution {
    public int arrayPairSum(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int result=0;
        boolean flag=false; //to check if the frequency is odd or even
        HashMap <Integer,Integer> map=new HashMap<>();

        for(int num: nums)
        {
            min=Math.min(min,num);
            max=Math.max(max,num);
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(int i=min;i<=max;i++)
        {
            if(map.containsKey(i))
            {
                if(flag)
                {
                    map.put(i,map.get(i)-1);
                }
                int cnt=map.get(i);
                int pairs=cnt/2;
                result+=pairs*i;

                if(cnt%2==0)    //even
                {
                    flag=false;
                }
                else
                {
                    flag=true;
                    result+=i;
                }
            }
        }
        return result;
    }
}