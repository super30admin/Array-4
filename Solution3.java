// Time Complexity :O(n)
// Space Complexity :O(1) no extra space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public void nextPermutation(int[] nums) {
        if(nums==null||nums.length==0)
            return;

    int n=nums.length;
    int first=-1;
    //find first breach from the end
    //array to the right of first was descending order
    for(int i=n-2;i>=0;i--){
        if(nums[i]<nums[i+1]){
             first=i;
            break;
        }     
    }
    //found a breach
    if(first!=-1){
       // find first elemnt from the right which is greater the element at first index
        for(int i=n-1;i>first;i--){
            if(nums[i]>nums[first])
            {
                swap(nums,i,first);
                break;
            }
        }
    }
    // reverse all elements so as to next closest permutation
// the array to the right of first ndex was in descending order
     reverse(nums,first+1,n-1);
    
        return;
    }
    private void swap(int [] nums, int s,int e){
        int temp=nums[s];
        nums[s]=nums[e];
        nums[e]=temp;
        
        return;
    }
    private void reverse(int [] nums, int s,int e){
        
        while(s<e){
            swap(nums,s,e);
            s++;
            e--;
        }
        return;
    }
}