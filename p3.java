// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach


class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length-2;
        //Find the number which can be swaaped to get the next permutation
        while(i!=-1 && nums[i]>=nums[i+1]){
            i--;
        }  

//Do the second step only if we find the number
//In the second step, replace that number with the next largest number on it's right side
        if(i!=-1){
            int j=nums.length-1;
            while(nums[j]<=nums[i]) j--;
            
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

//Reverse the array on the right
        for(int j = i+1; j<(i+1+nums.length)/2; j++){
            int temp = nums[j];
            nums[j] = nums[nums.length-j+i];
            nums[nums.length-j+i] = temp;
        }
    }
}