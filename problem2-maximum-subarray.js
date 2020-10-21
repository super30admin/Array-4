//https://leetcode.com/problems/maximum-subarray/submissions/
//runtime: O(n)
//space: O(1)
//passes leetcode? yes
//obstacles: none (already knew this one)
//explanation:
//  keep a currentmax and a max
//  currentmax will be a running sum as you traverse the input
//  max will be the max of all sums you have seen
//  at each iteration
//    currentmax will be Max(
//      currentmax plus the current number,
//      current number)
//    max will be Max(currentmax, max)
//
//  return Max(currentmax, max)
var maxSubArray = (nums) => {
  let [max, curmax] = [nums[0], nums[0]]

  nums.forEach((num, i) => {
    if (i === 0) return
    curmax = Math.max(curmax + num, num)
    max = Math.max(curmax, max)
  })

  return Math.max(max, curmax)
};
