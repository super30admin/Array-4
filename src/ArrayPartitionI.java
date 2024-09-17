import java.util.Arrays;

/*
 * The complexity of the algorithm is O(n Log n) where n is no of elements in array.
 * 
 */

public class ArrayPartitionI {

	public int arrayPairSum(int[] nums) {

		int n = nums.length;
		int sum = 0;
		Arrays.sort(nums);

		for (int i = 0; i < n; i = i + 2) {

			sum += nums[i];
		}

		return sum;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
