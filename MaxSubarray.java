/*
* Did this code successfully run on Leetcode : YES
* 
* Any problem you faced while coding this : NO
* 
* Time Complexity: O(n)
* 
* Space Complexity: O(1)
* 
*/

class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int sum = 0, maxSum = Integer.MIN_VALUE, start = -1, end =-1;

        for(int index = 0; index < nums.length; index++){
            sum+= nums[index];

            if(sum > maxSum){
                maxSum = sum;
                end = index;
            }

            if(sum < 0){
                sum = 0;
                start = index;
            }
        }

        System.out.println("start:"+(start+1)+" end:"+end);

        return maxSum;
    }
}