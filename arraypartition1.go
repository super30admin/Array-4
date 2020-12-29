// Time Complexity : O(nlogn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
/*
sort the numbers
add all even position numbers and return, (smaller of 2 of sorted)
*/
package main

import (
	"fmt"
	"sort"
)

func arrayPairSum(nums []int) int {
	sort.Ints(nums)
	sum := 0
	for i := 0; i < len(nums); i += 2 {
		sum += nums[i]
	}
	return sum
}

func MainArrayPairSum() {
	fmt.Println(arrayPairSum([]int{6, 2, 6, 5, 1, 2})) //expected 9
}
