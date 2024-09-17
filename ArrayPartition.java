import java.util.Arrays;
//Time Complexity : O(nlogn)
//Space Complexity : O(1)
public class Solution {		
	public int arrayPairSum(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        Arrays.sort(nums);
        int sum=0;
        for(int i=0; i<nums.length; i+=2){
            sum+=nums[i];
        }
        return sum;
    }
	
	// Driver code to test above
	public static void main (String[] args) {
		Solution ob= new Solution();
		int[] nums = {6,2,6,5,1,2};
		System.out.println("Maximized sum of the pairs is : "+ob.arrayPairSum(nums));					
	}	
}
