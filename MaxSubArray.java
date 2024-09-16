//tc: O(n) where n is length of input array
//sc: O(1)

class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int max = nums[0];
        int st = 0, end = 0, currSt = 0;
        int rMax = max;
        
        //at each iteration, we need to decide whether to add curr element to existing sum
        //or to start a new subarray from current index to maximize the sum
        for(int i=1; i<nums.length; i++){
            if(rMax + nums[i] < nums[i]){
                currSt = i;
                rMax = nums[i];
            }else{
                rMax = rMax + nums[i];
            }
            if(max < rMax){
                max = rMax;
                st = currSt;
                end = i;
            }
        }
        System.out.println(st+", "+end);
        return max;
    }
}