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
def maxSubArray(nums: List[int]) -> int:
    if not nums:
        return 0
    N = len(nums)
    # init current sum, max sum
    cs, ms = 0, float('-inf')
    start = 0
    start_sub, end_sub = None, None
    for i in range(N):
        if cs == 0: # empty subarray
            start = i # mark the start of the the subarray with i

        cs += nums[i] # include num[i] in the subarray

        if ms < cs:
            ms = cs
            start_sub, end_sub = start, i

        if cs < 0:
            cs = 0 # empty the subarray

    return ms, start_sub, end_sub

def run_maxSubArray():
    tests = [([-2,1,-3,4,-1,2,1,-5,4], [4,-1,2,1]),
             ([-2,-3,-1,-4,-5,], [-1]), # all -ve
             ([2,3,-8,7,-1,2,3], [7,-1,2,3]),
             ([5,4,1,7,8],[5,4,1,7,8]), # all +ve
             ([-4,-3,-2,-10,0,-11,-12],[0]),
    ]
    for test in tests:
        nums, ans = test[0], test[1]
        print(f"\nnums = {nums}")
        sum, start, end = maxSubArray(nums)
        print(f"Subarray with max sum = {nums[start:end+1]}")
        print(f"Max sum = {sum}")
        success = (ans == nums[start:end+1])
        print(f"Pass: {success}")
        if not success:
            print("Failed")
            return

run_maxSubArray()