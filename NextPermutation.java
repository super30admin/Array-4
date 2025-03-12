class Solution {
    //Time Complexity:O(n)
    //Space Complexity:O(1)
    public void nextPermutation(int[] nums) {
      if (nums.length == 0)
      return;

      // step 1 find the element that is smaller than its right

      int pt = nums.length-2;
      int pivot =0;
      while (pt >=0) {
        if (nums[pt] < nums[pt+1]){
            pivot = pt;
            break;
        } else {
            pt--;
        }
      }
      if (pt ==-1){
        reverse (nums,0, nums.length-1);
        return;
      }
      // step 2: once pivot is found, traverse to its' right to find the number thats the next biggest to it
      int flip =Integer.MAX_VALUE;
      int tracker = pivot+1;
      int nextFlip = 0;
      while (tracker < nums.length){
        if (nums[tracker] <= flip && nums[tracker] > nums[pivot]){
            flip = nums[tracker];
            nextFlip = tracker;
        }
        tracker++;
      }
      // NOW FLIP THOSE NUMBERS
      int temp = nums[pivot];
      nums[pivot] = nums[nextFlip];
      nums[nextFlip] = temp;
    // now, reverse the right side of the pivot position
    reverse (nums, pivot +1, nums.length-1);
    }

    private void reverse(int[] nums, int start, int end){
        while (start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
