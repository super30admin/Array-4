import java.util.ArrayList;
import java.util.List;

//Time complexity is O(n)
//Space complexity is O(1)
//This solution is submitted on leetcode

public class BigN122MaximumSubArrayWithArrayOutput {
	public List<Integer> maxSubArray(int[] nums) {
		// edge case
		if (nums == null || nums.length == 0)
			return new ArrayList<>();
		// defining all the pointers
		int slow = 0;
		int fast = 0;
		int ptr1 = slow;
		int ptr2 = fast;
		int local = 0;
		int global = 0;
		while (fast < nums.length) {
			local = local + nums[fast]; // running sum
			if (local < nums[fast]) {
				slow = fast;
				local = nums[fast];
			}
			if (local > global) {
				global = local;
				ptr1 = slow;
				ptr2 = fast;
			}
			fast++;
		}
		//System.out.println(ptr1);
		//System.out.println(ptr2);
		List<Integer> temp = new ArrayList<>();
		for(int i = ptr1; i<=ptr2;i++) {
			temp.add(nums[i]);
		}
		return temp;
	}
	public static void main(String [] agrs) {
		BigN122MaximumSubArrayWithArrayOutput max = new BigN122MaximumSubArrayWithArrayOutput();
		int [] nums = {-2,1,-3,4,-1,2,1,-5,4};
		List<Integer> tem = max.maxSubArray(nums);
		for (int k : tem)
		System.out.println(k);
	}
}