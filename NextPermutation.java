// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
 /* 
    1. Find peak Index
    2. Find next peak element comparing with Find peak Index
    3. swap peakIndex(1) and peakElement(2)
    4. reverse from peak+1 to n-1;
    */
    public void nextPermutation(int[] nums) {
        if(nums==null || nums.length==0)
            return;
        
        
        int peakIndex=0;
        for(int i = nums.length - 1; i > 0; i--){
            
            if(nums[i] > nums[i-1]){
                peakIndex = i-1;
                int peakElement = nums.length -1;
                while(peakElement > peakIndex && nums[peakElement] <= nums[peakIndex] ){
                    peakElement--;
                }
                swap(nums, peakIndex, peakElement);
                reverse(nums, peakIndex+1);
                return;
            }
        }
        
        reverse(nums, 0);
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