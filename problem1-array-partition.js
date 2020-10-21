//https://leetcode.com/problems/array-partition-i/
//runtime: O(nlogn)
//space: O(1)
//passing leetcode?: yes
//obstacles: not knowing the built-in sort
//explanation:
// sort in ascending order
// iterate by 2, adding every other element value to the running total
// return running total
var arrayPairSum = nums => {
  if (!nums || !nums.length) return 0;

  nums.sort((a, b) => a - b)

  let output = 0
  for(let i = 0; i < nums.length-1; i += 2) {
    output += nums[i]
  }
  return output
};

