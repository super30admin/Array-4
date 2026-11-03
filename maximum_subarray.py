'''
53 Maximum Subarray
https://leetcode.com/problems/maximum-subarray/description/


Given an integer array nums, find the subarray with the largest sum, and return its sum. Subarray = Contiguous non-empty sequence of elements within an array

Example 1:
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.

Example 2:
Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.

Example 3:
Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.


Constraints:
1 <= nums.length <= 105
-104 <= nums[i] <= 104

Follow up: If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.

Solution:
1. Brute Force:
Construct all possible subarrays using nested loops, calculate sum for each subarray and get the max sum among all sums.
Time: O(N^2), Space: O(1)

2. Kadane's Algorithm
The intuition of the algorithm is not to consider the subarray as a part of the answer if its sum < 0. A subarray with a sum < 0 will always reduce our answer and so this type of subarray cannot be a part of the subarray with maximum sum.

Here, we will iterate the given array with a single loop and while iterating we will add the elements in a current sum variable. Now, if at any point the current sum becomes < 0, we will set the current sum to 0 as we are not going to consider any subarray with a negative sum. Among all the sums calculated, we will consider the maximum one.
https://youtu.be/9IZYqostl2M?t=766
https://youtu.be/AHZpyENo7k4?t=472
https://youtu.be/uBTOIdBxb1o?t=2133
Time: O(N), Space: O(1)
'''
from typing import List

def maxSubArray_1(nums: List[int]) -> int:
    ''' Kadane's algorithm
        Time: O(N), Space: O(1)
    '''
    if not nums:
        return 0
    N = len(nums)
    rsum, maxsum = nums[0], nums[0]
    for num in nums[1:]:
        rsum = max(rsum + num, num)
        maxsum = max(maxsum, rsum)
    return maxsum

def maxSubArray_2(nums: List[int]) -> int:
    ''' Kadane's algorithm (+ print the subarray)
        Time: O(N), Space: O(1)
    '''
    if not nums:
        return 0
    N = len(nums)
    rsum, maxsum = nums[0], nums[0]
    start, end = 0, 0

    # Local tracking for the current running subarray
    rsum = nums[0]
    current_start = 0

    for i in range(1, len(nums)):
        num = nums[i]

        if rsum + num < num:
            # start a new subarray
            current_start = i
            rsum = num
        else:
            # extend the subarray window
            rsum = rsum + num

        # Update best subarray window when we find a new maximum sum
        if maxsum < rsum:
            maxsum = rsum
            start = current_start
            end = i

    return maxsum, nums[start:end+1]


def run_tests():
    tests = [([-2,1,-3,4,-1,2,1,-5,4], 6, [4,-1,2,1]),
             ([-2,-3,-1,-4,-5,], -1, [-1]), # all -ve
             ([2,3,-8,7,-1,2,3], 11, [7,-1,2,3]),
             ([5,4,1,7,8], 25, [5,4,1,7,8]), # all +ve
             ([-4,-3,-2,-10,0,-11,-12], 0, [0]),
    ]
    for test in tests:
        nums, ans1, ans2 = test[0], test[1], test[2]
        print(f"\nnums = {nums}")
        for method in [1, 2]:
            if method == 1:
                maxsum = maxSubArray_1(nums)
                print(f"Method {method}: Max sum of subarray = {maxsum}")
                passed = (ans1 == maxsum)
            elif method == 2:
                maxsum, subarr = maxSubArray_2(nums)
                print(f"Method {method}: Max sum of subarray = {maxsum}, Subarray with max sum = {subarr}")
                passed = (ans1 == maxsum and ans2 == subarr)
            print(f"Pass: {passed}")
            assert passed == True, f"Test case failed"
    print(f"\nDONE")

run_tests()