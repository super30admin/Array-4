/*

Passed All Test Cases 

Time-> O(N)
Space-> O(1)

where N is # of elements in the array 


*/

class Solution {
    public void nextPermutation(int[] nums) {
        //edge case 
        if(nums.length == 1) return ; 
        
        //finding the dip in the ascending array start from right 
        int n = nums.length ; 
        
        //we start checking with the before one
        int i = n - 2 ; 
        
        //fiding the dip
        while (nums[i] >= nums[i + 1]) {
            i-- ; 
            //if dip not found 
            if(i == -1)
                break ; 
        }
        
        int j = n -1 ; 
        
        //only when we find the dip 
        if(i > -1) {
            while (nums[j] <= nums[i]) {
                j-- ; 
            }
            //swaping dip with num just greater
        swap(nums, i, j) ; 
        }
        
        //reversing the rest 
        reverse(nums, i + 1, n - 1) ; 
        
        return ; 
    }
    
    private void reverse (int [] a, int i, int j) {
        while(i < j) {
            swap(a, i, j) ; 
            i++ ; 
            j-- ; 
        }
    }
    
    
    private void swap(int [] a, int i, int j) {
        int temp = a[i] ; 
        a[i] = a[j] ; 
        a[j] = temp ; 
        return ; 
    }
}