import java.util.Arrays;
//Time Complexity : O(n)
//Space Complexity : O(1)
public class NextPermutation {	
	public void nextPermutation(int[] nums) {
        int n= nums.length;        
        //Find the index of breach for swap 
        int i=n-2;
        while(i>=0 && nums[i] >= nums[i+1]){
            i--;
        }
        //Find the just next higher element to swap with
        if(i >=0){
            int j=n-1;
            while(nums[j] <= nums[i]){
                j--;
            }
            swap(nums, i, j);
        }
        //reverse the numbers from i+1 to end
        reverse(nums, i+1, n-1);
    }
    private void swap(int[] nums, int l, int r){
        int temp= nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
    private void reverse(int[] nums, int start, int end){
        while(start < end){
            swap(nums, start, end);
            start++;
            end--;
        }
    }
	
	// Driver code to test above
	public static void main (String[] args) {
		NextPermutation ob= new NextPermutation();
		int[] nums = {1,2,3};
		ob.nextPermutation(nums);
		System.out.println("Next permutation is : "+Arrays.toString(nums));					
	}	
}
