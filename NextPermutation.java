//Time Complexity-O(n)
//Space Complexity-O(1)
class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length==0||nums==null)
        {
            return;
        }
        int peakIndex=nums.length-2;
        int peakElementIndex=nums.length-1;
        while(peakIndex>=0&&
             nums[peakIndex]>=nums[peakIndex+1])
        {
            peakIndex=peakIndex-1;
        }
        if(peakIndex>=0)
        {
            while(nums[peakElementIndex]<=nums[peakIndex])
            {                
              peakElementIndex--;               
            }
            swap(nums,peakElementIndex,peakIndex);
            
        }
        reverse(peakIndex+1,nums.length-1,nums);
    }
    
    void swap(int[]nums,int i,int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    void reverse(int i,int j,int[] nums)
    {
        while(i<j)
        {
            swap(nums,i,j);
            i++;
            j--;
        }
    }
}