TC - O(N)
SC - O(1)

var swap = function(nums, i, j) {
  const temp = nums[i];
  nums[i] = nums[j];
  nums[j] = temp;
}
var nextPermutation = function(nums) {
  let i = nums.length - 2, j = nums.length - 1;
  while (i >= 0 && nums[i + 1] <= nums[i]) {
      i--;
  }
  if (i >= 0) {
      while (nums[j] <= nums[i]) {
          j--;
      }
      swap(nums, i, j);
  }
  i++;
  j = nums.length - 1;
  while (i < j) {
      swap(nums, i++, j--);
  }
};