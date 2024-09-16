// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public void nextPermutation(int[] nums) {
          // 3 1 4 8 7 6 2 1

        //algo
        //1. find the index that needs to be changed and it will be the element that is smaller than its next element
        // basically we are trying to find from the right if any element is breaking the increasing order/\
        // cos the first element to break that order would the one that can be replaced

        //2. we need to find the replacement and that can be found by the first element that is greater than the curr

        //3. then swap them and then sort the remaining right side


        int curr = nums.length - 2;


        while(curr >= 0 && nums[curr] >= nums[curr+1]){
            curr--;
        }

        if(curr == -1) reverse(nums, 0, nums.length-1);

        else{
            int temp = nums.length - 1;

            while(nums[curr] >= nums[temp]){
                temp--;
            }

            swap(nums,curr,temp);

            reverse(nums,curr+1, nums.length-1);

        }

        return;
    }


    private void swap(int[] nums, int start, int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }


    private void reverse(int [] nums, int start, int end){

        while(start < end){
            swap(nums, start, end);
            start++;
            end--;
        }

    }
}
