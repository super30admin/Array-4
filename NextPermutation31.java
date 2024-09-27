class Solution {
    // Time Complexity:  O(N)
    // Space Complexity: O(1)
    public void nextPermutation(int[] nums) {   // 24765321, len = 8 ( 0 to 7)
        if(nums == null || nums.length == 0)
            return;
        
        int peakIndex_fromRight = nums.length - 2; // last but one index, = 6
        
        // 24765321 --> 765321 has numbers increasing from right ==> 7 is the peak, peakIndex is at 4
        while(peakIndex_fromRight >= 0 && nums[peakIndex_fromRight] >= nums[peakIndex_fromRight + 1]){
            peakIndex_fromRight--;
        }
        
        // If peak exceeds the length, we return just the reverse, given in question
        // Finding element greater than peakIndex, which is 5 and not 7
        if(peakIndex_fromRight >= 0){
            int peak_elm = nums.length - 1;     // pointer
            
            while(nums[peak_elm] <= nums[peakIndex_fromRight]){
                peak_elm--;
            }
            swap(nums, peakIndex_fromRight, peak_elm);      
        }
        
        reverse(nums, peakIndex_fromRight + 1, nums.length - 1);
        
    }
    
    public void reverse(int[] nums, int start, int end){
        int temp;
        while(start < end){
            swap(nums, start, end);
            start++;
            end--;
        }
    }
    
    public void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}