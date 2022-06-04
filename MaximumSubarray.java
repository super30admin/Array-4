class Solution {

    //Time Complexity: 0(n) where n is the no of elements in the array
    //Space Complexity: 0(1)
    //Did it successfully run on leetcode: Yes
    //Did you fave any problem while coding: No

    //In brief, explain your approach

    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int rsum = nums[0]; //initializing our running sum to 1st element
        int max = nums[0];  //initializing our max to 1st index
        for(int i = 1; i < nums.length; i++){   //loop starts from 1 as 1st index is already taken care of
            rsum = rsum + nums[i];  //we add the rsum and the current no.
            rsum = Math.max(rsum, nums[i]); //check if the the sum of the subarray is greater than we continue to add the elements in our subarray or if the current element is greater than we reset our subarray to current index
            max = Math.max(max, rsum);  //store the max sum of all the subarrays visited
        }
        return max; //returns max
    }
}

//Follow up question, if we were asked to return the indices of the subarray with max sum

class Solution {



    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int rsum = nums[0];
        int max = nums[0];
        int start = 0;
        int curr = 0;
        int end = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] < rsum + nums[i]){
                rsum = rsum + nums[i];
            }
            else{
                rsum = nums[i]; //if rsum is reset, then we change out current start to it
                curr = i;
            }
            if(max < rsum){ //if max changes then only we reset our start and end pointer both
                max = rsum;
                start = curr;
                end = i;
            }
        }
        System.out.println("start = " + start + "  end = "+ end);
        return max;
    }
}

