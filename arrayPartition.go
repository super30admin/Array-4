// TC - O(n * log(n)) - because of sort
// SC - O(1)

// Approach:
// We know that we have an even number of elements, and we need to divide them
// into pairs. The best way to do this would be to first sort the array so that
// we can create pairs also in ascending order. The advantage is that every
// odd-index element is now the element we can consider to obtain the maximum
// sum.

package main

import "sort"

func arrayPairSum(nums []int) int {
	if len(nums) == 0 {
		return 0
	}

	sort.Ints(nums) // O(n * log(n))

	sum := 0
	for i := 0; i < len(nums); i += 2 {
		sum += nums[i]
	}
	return sum
}
