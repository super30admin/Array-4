// Time Complexity :O(N) 
// Space Complexity :O(1) 
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No.


// Your code here along with comments explaining your approach:Find the element which is greater than the previous element while traversing
// the array from end. then replace it with the element greater than that from the right. Then reverse the array from the next element.
class Solution {
    public void nextPermutation(int[] nums) {
        if(nums==null||nums.length==0)
            return;
        int n= nums.length;
        int i;
        for( i=n-1;i>0;i--){
            if(nums[i]>nums[i-1])
                break;
        }
            i--;
        if(i>=0){
           int j=n-1;
            while(j>i && nums[j]<=nums[i]){
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1,n-1);
    }
    private void reverse(int[] nums, int i, int j){
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
        }
    private void swap(int[] nums, int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    } 
}