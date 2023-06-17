// TC - O(n) - because of sort
// SC - O(1)

// Approach:
// We check pairs of elements from the end where the first element is smaller
// than the second one. This means that until that point, all the elements are
// in descending order. We swap the next greater element with the current one,
// and then reverse the right part of the list, which is guaranteed to give the
// next greatest permutation.

package main

func nextPermutation(nums []int) {
	if len(nums) == 0 {
		return
	}

	n := len(nums)
	first := -1 // location of first mismatch

	// iterate through pairs of elements from the last
	for i := n - 2; i >= 0; i-- {
		if nums[i+1] > nums[i] {
			// we found the mismatch then we're done
			first = i
			break
		}
	}

	// then find the next greater element but smaller than greater of the pair
	if first != -1 {
		for i := n - 1; i >= 0; i-- {
			if nums[i] > nums[first] {
				// swap that to the appropriate place in the array first
				nums[i], nums[first] = nums[first], nums[i]
				break
			}
		}
		reverse(nums, first+1) // remaining is is descending, so reverse
		return
	}

	// descending array, so return ascending array of the same
	reverse(nums, 0)
}

func reverse(nums []int, l int) {
	r := len(nums) - 1
	for l <= r {
		nums[l], nums[r] = nums[r], nums[l]
		l++
		r--
	}
}
