import java.util.Arrays;

public class arrayPartitioni {

	public int arraysPair(int[] nums) {
		// sort the array so that we can form pairs and obtain the minimum element in every pair, Sorting will easy the process of retrieving 
		// the min element
		Arrays.sort(nums);
		int sum = 0;
		for(int i=0;i<nums.length-1;i+=2) {
		// if we observe carefully, the pattern after sorting shows that every first element in pair is minimum,
			// so we can directly add the second element from the array to our result, So, we are  moving our index+2
			sum += nums[i];
		}
		// return the sum calculated
		return sum;
	}
	
	public static void main(String[] args) {
		
		arrayPartitioni ap = new arrayPartitioni();
		int[] nums = {1,4,2,3};
		System.out.println(ap.arraysPair(nums));
	}
}
