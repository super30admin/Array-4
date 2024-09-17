//Time Complexity : O(n)
//Space Complexity : O(1)
public class MaxSubarray {	
	/**Approach: Running Sum**/
	public int maxSubArray(int[] nums) {	        
		if(nums == null || nums.length==0) return 0;
		//logic
        int curSum= nums[0];
        int maxSum= nums[0];
        for(int i=1; i< nums.length; i++){
            curSum = Math.max(curSum+nums[i], nums[i]);
            maxSum = Math.max(maxSum, curSum);
        }
        return maxSum;
	}
	
	// Driver code to test above
	public static void main (String[] args) {
		MaxSubarray ob= new MaxSubarray();
		int[] arr= {-2,1,-3,4,-1,2,1,-5,4};
		
		System.out.println("Largest Sum of Subarray is : "+ ob.maxSubArray(arr));
	}
}
