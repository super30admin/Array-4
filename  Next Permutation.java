//Time Complexity : O(n)
//Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes 
// Any problem you faced while coding this :no
// Your code here along with comments explaining your approach
class Solution {
    public void nextPermutation(int[] nums) {
        if(nums==null||nums.length==0){
            return;
        }
        int n = nums.length;
        //locate mismatch :  fins a number hat is not in the increasing order
        int t=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                t = i;
                break;
            }
        }
        //swap that number with the immediate next increasing number
        if(t!=-1){
            for(int j=n-1;j>t;j--){
                if(nums[j] > nums[t]){
                    swap(nums,j,t);
                    break;
                }
            }
        }
        //Reverse from t+1 to n-1
        reverse(nums,t+1);
    }
    private void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}