//The approach here is to find the action digit first to which we should find the next greater number.
//Once we find the action digit, we swap it with the next bigger digit to it's right and then reverse the numbers to the right of action digit to get next permutation
//If we don't find an action digit, then we directly reverse digits as we already have the largest number possible with that digits
//Time Complexity: O(n)
//Space Complexity: O(1)
class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        //find action digit
        int index = -1;
        for(int i = n-2; i>=0; i--){
            if(!(nums[i] >= nums[i+1])){
                index = i;
                break;
            }
        }
        if(index >=0){
            //find smallest greater digit to the right of index
            int j = n-1;
            while(nums[index] >= nums[j]){
                j--;
            }
            swap(nums, index, j);
        }
        //now reverse the digits to the right of action digit
        reverse(nums, index+1, n-1);
    }

    private void swap(int[] nums, int m, int n){
        int temp = nums[m];
        nums[m] = nums[n];
        nums[n] = temp;
    }

    private void reverse(int[] nums, int start, int end){
        int temp;
        while(start<end){
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
