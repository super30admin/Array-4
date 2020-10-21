// https://leetcode.com/problems/next-permutation/
// runtime: O(n)
// space: O(1)
// passing leetcode?: yes
// obstacles: intuition i would never have gotten
// explanation:
//
//  search the current permutation right to left
//  find the number such that L < R where, L will be your peak index
//  search right to left again, searching for the first number > L
//  swap peak index with this number
//  reverse peak index + 1 numbers

var nextPermutation = (nums) => {
  if (!nums || !nums.length) return

  const swap = (i, j) => {
    const temp = nums[i]
    nums[i] = nums[j]
    nums[j] = temp
  }

  const reverse = (start, end) => {
    if (start >= end) return

    while (start < end) {
      swap(start, end)
      start++
      end--
    }
  }

  // find peak_index
  // (nums = 312, start searching from the 1 or nums.length-2)
  let peak_index = nums.length - 2
  while(peak_index >= 0) {
    if (nums[peak_index] < nums[peak_index+1]) { // should find 1 > 2
      break;
    }
    peak_index--
  }

  // find and swap
  if (peak_index >= 0) { // only if peak_index is in range
    // find number just greater than peak_index
    let greater = nums.length-1
    while(nums[peak_index] >= nums[greater]) {
      greater--
    }
    swap(peak_index, greater)
  }

  // reverse peak_index+1...length-1
  reverse(peak_index+1, nums.length-1)
}
