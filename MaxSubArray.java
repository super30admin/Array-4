package week10.day2;
//TC - O(n)
//SC - O(1)
class Solution29 {
    public int maxSubArray(int[] nums) {
        int rSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;
        int global_start =0;
        int global_end =0;
        for(int i=0;i<nums.length;i++){
            if(rSum+nums[i]>nums[i]){
                rSum = rSum+nums[i];
                end++;
            } 
            else{
                rSum = nums[i];
                start = i;
                end = i;
            }
            if(rSum>maxSum){
                global_start = start;
                global_end = end;
            }
            maxSum = Math.max(rSum,maxSum);
        }
        System.out.println("global_start"+global_start);
        System.out.println("global_end"+global_end);
        return maxSum;
    }
}
public class MaxSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
