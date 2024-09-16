
public class nextPermutation {

	public void nextPermuations(int[] nums) {
		
		int i = nums.length-2;
		// to find the next greatest permutation, we need to check for the last 2 elements are sorted, if they are, we can swap just the
		// last 2 elements or else we will need move behind till I find elements in ascending order
		while(i >=0 && nums[i+1] <= nums[i]) 
			i--;
		// if we find any starting point of array in ascending order, we try and swap the elements to get next greater permutations
		// if not,(our i will be negative) we just reverse the entire array since if we don't find the next permutation, we return first lowest order
		
		if(i >= 0) {
			int j = nums.length-1;
			// take 2 pointers and keep decrementing j index until we find the jth value in array greater then ith index so that we can swap the elements and find the 
			// greater permutations
			while(j >=0 && nums[j]<=nums[i]) {
				j--;
			}
			swap(nums, i, j);
		}
		// 
		reverse(nums, i+1);
	}


	private void swap(int[] nums, int i, int j) {
		// TODO Auto-generated method stub
		
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
		
	}

	private void reverse(int[] nums, int i) {
		// TODO Auto-generated method stub
		
		int st = i, end = nums.length-1;
		
		while(st<end) {
			swap(nums, st, end);
			st++;
			end--;
		}
		
	}
	
	public static void main(String[] args) {
		
		nextPermutation np = new nextPermutation();
		int[] nums = {1,2,3};
		np.nextPermuations(nums);
		
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
	}
}