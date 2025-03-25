// TC: O(n)
// SC: O(1)

public class NextPermutation {
    private void swap(int nums[], int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private void reverse(int nums[], int i, int j){
        while(i<j){
            swap(nums, i, j);
            i++;
            j--;
        }
    }
    public void nextPermutation(int[] nums) {
        if(nums==null || nums.length==0) return;
        int n = nums.length;
        int i=n-2;
        while(i>=0){
            if(nums[i]<nums[i+1]) break;
            i--;
        }
        if(i==-1) {
            reverse(nums, 0, n-1);
            return;
        }
        int nextNumIdx = i;
        for(int k=i+1;k<n;k++){
            if(nums[k]>nums[i]){
                nextNumIdx = k;
            }
        }
        swap(nums, i, nextNumIdx);
        reverse(nums, i+1, n-1);
    }
}
