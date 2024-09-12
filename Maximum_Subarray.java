
public class Maximum_Subarray {
	 public int maxSubArray(int[] nums) {
		 //Approach: Here we iterate over the array and maintain localSum and globalSum. When we get an element we will see whether the new sum is greater than the number itself,
		 //if so we will add the number to localSum or reset the sum to the number itself.
		 //When we find new sum we will check with max and rest accordingly.
	        int max = Integer.MIN_VALUE;
	        int sum  = 0;
	        int start = 0, end = 0, k=0;
	        for(int loop = 0;loop < nums.length;loop++)
	        {
	            if(sum+ nums[loop] > nums[loop])
	            {
	                sum += nums[loop];
	                
	            }else
	            {
	                sum = nums[loop];
	                k = loop;
	            }
	            if(sum > max)
	            {
	                max = sum;
	                start = k;
	                end = loop;
	            }
	        }
	        System.out.println(start);
	        System.out.println(end);
	        return max;
	    }
	}
//Time Complexity : O(n)
//Space Complexity : O(1)
//Did this code successfully run on Leetcode :
//Any problem you faced while coding this :
