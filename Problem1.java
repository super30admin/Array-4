// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public int arrayPairSum(int[] nums) {
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            mini = Math.min(mini,nums[i]);
            maxi = Math.max(maxi,nums[i]);
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        boolean flag = true;
        int cnt = 0;
        for(int i = mini; i <= maxi; i++){
            if(map.containsKey(i)){
                int pairs = map.get(i)/2;
                cnt += pairs*i;
                int rem = map.get(i)%2;
                if(flag){
                    cnt+=rem*i;
                    }
                    if(rem != 0)
                     flag = !flag;
                
            }
        }
        return cnt;

    }
}