//time complexity-O(n)
//Space complexity-O(1)
//Ran on leetcode-Yes
//Solution with comments-
class Solution {
    public void nextPermutation(int[] nums) {
        int start=0;
        int end=nums.length-1;
        int peak=-1;
        int peak_index=-1;
        for(int i=nums.length-2;i>=0;i--){//find the first peak which would tbe the number greater than its left number coming from right side
            if(nums[i]<nums[i+1]){
                peak=nums[i];
                peak_index=i;
                break;
            }
        }
        if(peak!=-1){
            for(int i=nums.length-1;i>=peak_index;i--){//swap the peak number with first highest number to its right
                if(nums[i]>peak){
                    swap(nums,i,peak_index);
                    start=peak_index+1;
                    break;
                }  
            }
        }
        reverse(nums,start,end);//reverse all the elements after the peak swap on peak index
    }
    
    public void reverse(int[] nums,int start,int end){
        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
    public void swap(int[] nums, int start, int end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
    }
    
  
}