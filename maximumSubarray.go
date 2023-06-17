// TC - O(n)
// SC - O(1)

// Approach:
// We use a running sum approach. At each element, we compare whether the
// previous max is greater or current element itself is more than that. We
// update running sum with the greater of the two and update max if this is
// greater than existing max.

package main

func maxSubArray(nums []int) int {
	if len(nums) == 0 {
		return 0
	}

	rsum := nums[0] // running sum approach
	maxV := nums[0]

	for i := 1; i < len(nums); i++ {
		rsum = max(nums[i], rsum+nums[i])
		maxV = max(maxV, rsum)
	}

	return maxV
}

func max(a, b int) int {
	if a > b {
		return a
	}
	return b
}
