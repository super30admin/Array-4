// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
/*
	find first place where number is smaller than next element
	if that position is -1 then its the last combo so return to original ascending order
	else
	from end to k find element that is bigger than element at k
	swap k and that element
	for all elements above k sort in ascending order
*/
package main

import "fmt"

func nextPermutation(nums []int) {
	n := len(nums)
	k := -1
	l := -1
	for k = n - 2; k >= 0; k-- {
		if nums[k] < nums[k+1] {
			break
		}
	}
	if k == -1 {
		reverse(&nums, 0, n-1)
	} else {
		for l = n - 1; l > k; l-- {
			if nums[l] > nums[k] {
				break
			}
		}
		swap(&nums, k, l)
		reverse(&nums, k+1, n-1)
	}

	fmt.Println(nums)
}

func reverse(nums *[]int, i, j int) {
	for i < j {
		swap(nums, i, j)
		i++
		j--
	}
}

func swap(nums *[]int, i, j int) {
	tmp := (*nums)[i]
	(*nums)[i] = (*nums)[j]
	(*nums)[j] = tmp
}

func MainNextPermutation() {
	nextPermutation([]int{1, 3, 2, 4}) //expected 1342
}
