//Leetcode :31. Next Permutation
//Time complexity: O(n)
//Space Complexity: O(1)
class Solution {
    public void nextPermutation(int[] nums) {
        if(nums== null || nums.length==0) return;
        //  Find element to swap
        int i= nums.length-2;
        while(i>=0){
            if(nums[i]< nums[i+1]) break;
            i--;
        }
        //Find no to swap with 
        int j= nums.length-1;
        int s=i+1;
        if(i>=0 ){
            while(j>i){
                if(nums[j]>nums[i]){
                    swap(nums,i,j);
                     break;
                }
                j--;
            }
        }
        //Reverse the numbers ahead of i
        reverse(nums, s);
        return ;
        
        
    }
    public void swap(int[] nums, int i,int j){    
        int temp= nums[i];
        nums[i]= nums[j];
        nums[j]=temp;
        return;
    }
    public void reverse(int[] nums, int i){
        int j=nums.length-1;
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
        return;
    }
}