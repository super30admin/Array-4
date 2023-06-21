class Solution {

    //Time Complexity: O(n)
    //Space Complexity : O(1)
    
    public void nextPermutation(int[] nums) {
        
        if(nums == null || nums.length == 0) return;

        int n = nums.length;
        int i = n-2;

        //iterating through array starting from the end till we get the element which is not greater than it's right element
        while(i>=0 && nums[i] >= nums[i+1]){
            i--;
        }

        //if i>=0, if the whole array is in decending order then in that case i would be -1
        if(i>=0){
            
            int j = n-1;
            
            //comapering the ith element to it's right hand side numbers, starting from the end; whenever we get the number which is just greater than ith element, then we just swap those 2 numbers
            while(nums[j] <= nums[i]){
                j--;
            }
            swap(nums, i, j);
        }
        //reversing the array
        reverse(nums, i+1, n-1);
    }

    private void reverse(int[] nums, int start, int end){

        //reversing the array from start to end
        while(start<end){
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    private void swap(int[] nums, int index1, int index2){
        
        //swapping the two numbers
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }


    
    //Time Complexity: O(n)
    //Space Complexity : O(1)
    
    // public void nextPermutation(int[] nums) {
        
    //     int n = nums.length;
        
    //     for(int i= n-2; i>=0; i--){
            
    //         if(nums[i]< nums[i+1]){
                
    //             int j=n-1;
                
    //             while(j>i){
                    
    //                 if(nums[j]>nums[i]){
    //                     break;
    //                 }
    //                 j--;
    //             }
                
    //             swap(nums, i, j);
                
    //             reverse(nums, i+1, n-1);
                
    //             return;
                
    //         }
    //     }
    //     reverse(nums, 0, n-1);
    // }
    
    // private void swap(int[] nums, int i, int j){
        
    //     int temp = nums[i];
    //     nums[i] = nums[j];
    //     nums[j] = temp;   
    // }
    
    // private void reverse(int[] nums, int left, int right){
        
    //     while(left < right){
            
    //         swap(nums, left, right);
    //         left++;
    //         right--;
            
    //     }
    // }
}
