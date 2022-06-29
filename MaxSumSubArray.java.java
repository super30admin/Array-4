// Time Complexity : O(n) n no.of elements in the height array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
took the running sum at every index and compared it with the upcoming numbers in the array and the max so far


cclass Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null) return 0;
        int rsum = nums[0],max = nums[0];//start=0,end=0,curstart=0;
        for(int i=1;i<nums.length;i++){
            rsum = rsum + nums[i];
            if(rsum<nums[i]){
                rsum =nums[i];
                //curstart =i;
            }
            if(max<rsum){
                //start =curstart;
                //end=i;
                max = rsum;
            }
        }
        //System.out.println(start);
        //System.out.println(end);
        return max;
    }
}