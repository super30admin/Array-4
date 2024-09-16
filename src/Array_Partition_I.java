import java.util.Arrays;
import java.util.PriorityQueue;
//Time Complexity :O(n log n), size of array and logn for sorting
//Space Complexity :O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

public class Array_Partition_I {
	public int arrayPairSum(int[] nums) {
		Arrays.sort(nums);
		int sum = 0;
		for(int i=0; i<nums.length; i+=2){  //every 1st element in a pair is min value as they are sorted 
			sum += nums[i];
		}
		return sum;
	}
}


/*********************************Using Prioriry Queue*****************************/
//Time Complexity :O(n log n), size of array and logn for pq
//Space Complexity :O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

class Array_Partition_I_PQ {
	public int arrayPairSum(int[] nums) {
		PriorityQueue<Integer> pq = new PriorityQueue<>(nums.length);
		for(int i=0; i<nums.length; i++)
			pq.add(nums[i]); //elements will be in sorted order

		int sum =0;
		while(pq.size() >1){
			sum+= pq.poll();
			pq.poll();
		}
		return sum;
	}
}