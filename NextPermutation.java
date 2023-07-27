// Time Complexity :O(n) where n is the number of elements in the nums array
// Space Complexity :O(1) as no auxiliary space is used
// Did this code successfully run on Leetcode :yes
public class NextPermutation {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length < 1){
            return;
        }
        //find the breach
        int n = nums.length;
        int breachIndex = -1;
        for(int i=n-1; i>0; i--){
            if(nums[i-1] < nums[i]){
                breachIndex = i-1;
                break;
            }
        }
        if(breachIndex == -1){
            reverse(nums, 0, n-1);
            return;
        }
        //breach at i
        int j = n-1;
        while(j>=0 && j>breachIndex){
            if(nums[j] > nums[breachIndex]){
                swap(nums, breachIndex, j);
                break;
            }
            j--;
        }
        //now reverse breachIndex+1 to end
        reverse(nums, breachIndex+1, n-1);
    }
    private void reverse(int[] nums, int start, int end){
        while(start >=0 && start < nums.length &&
                end>=0 && end<nums.length && start <end){
            swap(nums, start,end);
            start++; end--;
        }
    }
    private void swap(int[] nums, int i, int j){
        if(i != j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}
