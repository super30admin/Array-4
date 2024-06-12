// TC: O(3n)
// SC: O(1)
public class Problem3{
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n-2;
        while(i>=0 && nums[i]>=nums[i+1]) i--;
        if(i>=0){
            int j=n-1;
            while(nums[i]>=nums[j]) j--;
            swap(nums,i,j);
        }
        reverse(nums, i+1, n-1);

    }

    private void reverse(int[] nums, int j, int k){
        while(j<=k){
            swap(nums, j,k);
            j++;
            k--;
        }
    }

    private void swap(int[] nums, int j, int k){
        int temp = nums[j];
        nums[j]=nums[k];
        nums[k]=temp;
    }
}