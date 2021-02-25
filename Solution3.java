//Time Complexity:O(n)
//Space Complexity: O(1)
class Solution3 {
	public void nextPermutation(int[] nums) {
		if(nums == null || nums.length ==0)
			return;
		int len = nums.length;
		int i =len-2;
		int j;
		while(i >=0 && nums[i] >= nums[i+1]) {
			i--;
		}
		if(i >=0){
			for(j= len-1;j>=0;j--){
				if(nums[i] < nums[j])
					break;
			}

			swap(nums,i,j);
		}
		reverse(nums,i+1,len-1);
	}
	private void reverse(int[] nums, int i,int j){
		while(i <=j){
			swap(nums,i,j);
			i++;
			j--;
		}
	}
	private void swap(int[] nums, int i,int j){
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] =temp;
	}
} 