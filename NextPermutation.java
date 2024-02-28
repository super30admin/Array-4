// Time Complexity :O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yess
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach: use reverse, swap operations

class Solution {
    public void nextPermutation(int[] nums) {
        int n= nums.length;
        int idx=-1;

        for(int i=n-2; i>=0; i--){
            if(nums[i]<nums[i+1]){
                idx=i;
                break;
            }
        }
        if(idx==-1){
            reverse(nums,0,n-1);
            return;
        }

        for(int j=n-1; j>idx; j--){
            if(nums[j]>nums[idx]){
                swap(nums,j,idx);
                break;
            }
        }
        reverse(nums, idx+1, n-1);
    }

    public void reverse(int[] nums,int start, int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
            
        }
       
    }

    public void swap(int[] nums,int e, int index){
        int temp=nums[e];
        nums[e]=nums[index];
        nums[index]=temp;
    }
   
}