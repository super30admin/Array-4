// Time Complexity : O(n log n) - N is array size
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class ArrayPartition {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int result = 0;

        for(int i=0;i< n;i=i+2){
            result += nums[i];
        }

        return result;
    }
}

// Time Complexity : O(N) - N is array size
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//Bucket Sort approach
class Solution {
    public int arrayPairSum(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int min= Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int result=0;
        for(int i : nums){
            map.put(i , map.getOrDefault(i, 0)+1);
            min = Math.min(min, i);
            max= Math.max(max, i);
        }
        boolean flag = false;
        for(int i=min;i<=max;i++) {
            if(map.containsKey(i)) {

                if(flag){
                    map.put(i, map.get(i)-1);
                }
                int count = map.get(i);
                int pair = count/2;

                result += pair * i;

                if(count % 2 ==0){
                    flag = false;
                }else{
                    result += i;
                    flag= true;
                }
            }
        }

        return result;
    }
}