import java.util.Arrays;

// Time O(NlogN)
//Space O(1)

public class ArrayPartition {
	 public int arrayPairSum(int[] nums) {
	        if(nums==null ||nums.length==0)
	            return 0;
	        int sum=0;
	        Arrays.sort(nums);
	        
	        for(int i=0;i<nums.length;i+=2){
	            sum+=nums[i];
	        }
	        return sum;
	    }
}
