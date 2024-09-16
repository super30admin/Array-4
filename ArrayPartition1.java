class Solution {

    //Time Complexity: 0(nlogn) where n is the no of elements in the array
    //Space Complexity: 0(1)
    //Did it successfully run on leetcode: Yes
    //Did you fave any problem while coding: No

    //In brief, explain your approach

    public int arrayPairSum(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);  //sorting the array so that no's are placed next to each other so that we can take the minimum of 2 minimising the loss
        int sum = 0;    //initializing the sum
        for(int i = 0; i < nums.length-1; i+=2){    //running a for loop and increasing i by 2 as we work on 2 elements at a time
            sum = sum + Math.min(nums[i], nums[i+1]);   //adding the previous sum and the minimum of 2 no's at each interval
        }
        return sum; //returning sum
    }
}