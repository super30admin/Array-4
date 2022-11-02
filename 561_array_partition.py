"""

## Problem 561: Array Partition

## Author: Neha Doiphode
## Date:   10-31-2022

## Description
    Given an integer array nums of 2n integers, group these integers into n pairs (a1, b1), (a2, b2), ..., (an, bn)
    such that the sum of min(ai, bi) for all i is maximized. Return the maximized sum.

## Examples:
    Example 1:
        Input: nums = [1,4,3,2]
        Output: 4
        Explanation: All possible pairings (ignoring the ordering of elements) are:
                    1. (1, 4), (2, 3) -> min(1, 4) + min(2, 3) = 1 + 2 = 3
                    2. (1, 3), (2, 4) -> min(1, 3) + min(2, 4) = 1 + 2 = 3
                    3. (1, 2), (3, 4) -> min(1, 2) + min(3, 4) = 1 + 3 = 4
                    So the maximum possible sum is 4.

    Example 2:
        Input: nums = [6,2,6,5,1,2]
        Output: 9
        Explanation: The optimal pairing is (2, 1), (2, 5), (6, 6). min(2, 1) + min(2, 5) + min(6, 6) = 1 + 2 + 6 = 9.

## Constraints:
    1 <= n <= 104
    nums.length == 2 * n
    -104 <= nums[i] <= 104

## Time complexity: Please refer to respective doc-strings of the approaches used below to solve the problem.

## Space complexity: Please refer to respective doc-strings of the approaches used below to solve the problem.

"""

from typing import List, Optional

def get_input():
    print("Enter the inetger array(with spaces): ", end = "")
    inp_list = input()
    inp_list = [int(value) for value in inp_list.split()]
    return inp_list

class Solution:
    def arrayPairSum_with_counting_sort(self, nums: List[int]) -> int:
        """
        Time complexity : O(n + K), where n is the number of elements in the array and K is length of the counting array.
        Space complexity: O(K), as we use auxiliary array to store element counts which is of length K.
        """
        abs_bound_1 = abs(min(nums))
        abs_bound_2 = abs(max(nums))

        k = abs_bound_1 if abs_bound_1 > abs_bound_2 else abs_bound_2

        counter_array = [0 for _ in range(2 * k + 1)]

        for element in nums:
            counter_array[element + k] += 1

        max_sum = 0

        # since we start with 0, min elements will be present at all even indices
        # in sorted array, all even indexed elements will contribute to the max_sum
        is_even_index = True

        for element in range(2 * k + 1):
            while counter_array[element] > 0:
                if is_even_index:
                    max_sum += element - k

                is_even_index = not is_even_index
                counter_array[element] -= 1

        return max_sum

    def arrayPairSum(self, nums: List[int]) -> int:
        """
        Time complexity : O(n log n), where n is the number of elements in the array.
                                      * O(n log n) to sort the array.
                                      * O(n) to go over the sorted array in pairs and find min element in each pair.
                                              and to compute the sum.
                                      we choose a greater term to come up with asymptotic time complexity.
        Space complexity: O(n), we count the space required for counting. Python uses TimSort which has a space complexity of O(n).

        Notes:
            The key observation here is that if we have a pair like (a,b) such that a ≤ b,
            then we will add a to the answer and b cannot be used anymore.
            Therefore, in each such pair, we will add the value of the smaller element but the greater element will not contribute to the answer.

            Suppose x is the smallest possible element in the given list. This means that the contribution to the answer for any pair that includes x must be x,
            irrespective of the paired element.
            The other element will essentially be wasted. Hence to minimize our losses, we would like to pair x with the smallest element other than x.

            We can say that here, we are using simple, intuitive greedy approach as the final solution is based on optimal choices made at each gradual step.

        """
        nums = sorted(nums)
        sum_i = 0
        for i in range(0, len(nums), 2):
            sum_i += min(nums[i], nums[i+1])
        return sum_i

# Driver code
solution = Solution()
inp_array = get_input()
print(f"Input array: {inp_array}")
print(f"Approach 1: Using in-built sorting: Output max pair sum: {solution.arrayPairSum(inp_array)}")
print(f"Approach 2: Using counting sort   : Output max pair sum: {solution.arrayPairSum_with_counting_sort(inp_array)}")
