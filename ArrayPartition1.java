//tc is nlog n 
//sc is o(1)
//idea is to sort array and add every no after 1 element.
import java.util.Arrays;

public class ArrayPartition1 {
	    public int arrayPairSum(int[] nums) {
	        Arrays.sort(nums);
	        int sum = 0;
	        for(int i = 0; i < nums.length - 1; i += 2) {
	            sum += nums[i];
	        }
	        return sum;
	    }
}
