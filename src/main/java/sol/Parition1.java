


import java.util.Arrays;

public class Parition1 {
	 public int arrayPairSum(int[] nums) {
	        Arrays.sort(nums);
	        int sum=0;
	        for(int i=0;i<nums.length;i=i+2){
	            sum=sum+Math.min(nums[i],nums[i+1]);
	            
	        }
	        
	        return sum;
	    }
}
