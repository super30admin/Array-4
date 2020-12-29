// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
/*
	we know current contiguous max sum if we know continuous max sum of previous index
	DP[i] = DP[i - 1] + nums[i] if DP[i - 1] >= 0
	DP[i] = nums[i] if DP[i - 1] < 0
	ans is max between ans, curr
*/
package main

import "fmt"

func maxSubArray(nums []int) int {
	ans := nums[0]
	curr := nums[0]
	for i := 1; i < len(nums); i++ {
		if curr >= 0 {
			curr += nums[i]
		} else {
			curr = nums[i]
		}
		ans = max(ans, curr)
	}
	return ans
}

func max(a, b int) int {
	if a > b {
		return a
	}
	return b
}

func MainMaximumSubArray() {
	fmt.Println(maxSubArray([]int{-2, 1, -3, 4, -1, 2, 1, -5, 4})) //expected 6
}
