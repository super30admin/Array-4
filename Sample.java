// Problem 1 - Array Partition I
// Time Complexity: O(nlogn + n/2) where n = length of array
// Space Complexity: O(1)

// Algorithm
// 1 - sort the array
// 2 - keep adding every second num from 0 to sum
class Solution {
  public int arrayPairSum(int[] nums) {
    if (nums == null || nums.length == 0) {
      return 0;
    }
    // 1
    Arrays.sort(nums);
    int sum = 0;
    // 2
    for (int i=0; i<nums.length; i += 2) {
      sum += nums[i];
    }

    return sum;
  }
}

// Problem 2 - Maximum Subarray
// Time Complexity: O(n) where n = length of array
// Space Complexity: O(1)

// Algorithm
// 1 - initiliaze sum and max_sum
// 2 - loop over array
// 3 - sum is max of sum + current element and current element
// 4 - max_sum is max of sum and max_sum
// 5 - return max_sum
class Solution {
  public int maxSubArray(int[] nums) {
    if (nums == null || nums.length == 0) {
      return 0;
    }
    // 1
    int sum = 0;
    int max_sum = Integer.MIN_VALUE;
    // 2
    for (int i=0; i<nums.length; i++) {
      // 3
      sum = Math.max(sum + nums[i], nums[i]);
      // 4
      max_sum = Math.max(sum, max_sum);
    }
    // 5
    return max_sum;
  }
}

// Problem 3 - Next Permutation
// Time Complexity: O(n) where n = length of array
// Space Complexity: O(1)

// Algorithm
// 1 - find the 1st peak from right side
// 2 - if peak_index is greater than 0, then
// 3 - find next highest element index to peak_index element
// 4 - swap the peak_index element with peak_element element
// 5 - reverse the element from peak_elem + 1 index to end
class Solution {
  public void nextPermutation(int[] nums) {
    if(nums == null || nums.length == 0) {
      return;
    }
    // 1
    int peak_index = nums.length - 2;
    while (peak_index >= 0 && nums[peak_index] >= nums[peak_index + 1]) {
      peak_index -= 1;
    }
    // 2
    if (peak_index >= 0) {
      // 3
      int peak_elem = nums.length - 1;
      while (peak_elem >= 0 && nums[peak_elem] <= nums[peak_index]) {
        peak_elem -= 1;
      }
      // 4
      swap(nums, peak_elem, peak_index);
    }
    // 5
    reverse(nums, peak_index + 1, nums.length - 1);
  }

  private void reverse(int[] nums, int start, int end) {
    while (start < end) {
      swap(nums, start, end);
      start += 1;
      end -= 1;
    }
  }

  private void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;        
  }
}
