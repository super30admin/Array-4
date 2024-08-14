'''
Solution:
1.  Use Kadane's algorithm or divide and conquer.
2.  In Kadane's algorithm, maintain a global max, and take the max of current window's sum and current element.
    If current max greater => update global max
3.  In Divide and Conquer, take the max sum from left half, from right half and also max cross sum fro mid
    These 3 sums are from contiguous sub arrays and so take max of 3 to get final max sum of contiguous sub array.

Time Complexity:    O(N)    |   Space Complexity:   O(1) --> Kadane's Algorithm
Time Complexity:    O(NlogN)    |   Space Complexity:  O(logN) --> Divide and Conquer
--- Passed all testcases on Leetcode successfully for both the solutions.
'''


class MaximumSubArrayKadane:

    #	Time:	O(n)	|	Space:	O(1)
    def maxSubArray(self, nums: List[int]) -> int:
        #	maximum var to keep track of maximum of entire subarray
        maxSoFar = nums[0]

        #	at each index, keep track of whether the element contributes to max sum or not
        maxAtCurrent = nums[0]

        for i in range(1, len(nums)):
            #	update max at current index from one of 2 options
            #	add it to max of previous index or consider only current element
            maxAtCurrent = max(maxAtCurrent + nums[i], nums[i])

            #	update the overall maximum sum of subarray seen till current index
            maxSoFar = max(maxAtCurrent, maxSoFar)

        return maxSoFar


class MaximumSubArrayDnC:

    def __maxCrossingSum(self, nums, start, end):

        mid = start + int((end - start) / 2)

        #   max running sum from mid to left
        leftMax = float('-inf')
        leftRS = 0
        for i in range(mid, start - 1, -1):
            leftRS += nums[i]
            leftMax = max(leftMax, leftRS)

        #   max running sum from mid to end
        rightMax = float('-inf')
        rightRS = 0
        for i in range(mid + 1, end + 1):
            rightRS += nums[i]
            rightMax = max(rightMax, rightRS)

        #   add both of them and that gives max cross sum which is of a contiguous subarray
        return leftMax + rightMax

    def __maxSubArrayDnC(self, nums, start, end):

        #   base case --> 1 element
        if (start == end):
            return nums[start]

        mid = start + int((end - start) / 2)

        #   calculate max sum of contiguous sub array left side and right side separately
        #   along with max cross sum
        #   all 3 of them are contiguous subarrays => take max of 3 which results in max for entire array
        leftMaxSub = self.__maxSubArrayDnC(nums, start, mid)
        rightMaxSub = self.__maxSubArrayDnC(nums, mid + 1, end)
        maxCrossingSum = self.__maxCrossingSum(nums, start, end)

        return max(leftMaxSub, maxCrossingSum, rightMaxSub)

    def maxSubArray(self, nums: List[int]) -> int:

        #   use helper function
        n = len(nums)
        return self.__maxSubArrayDnC(nums, 0, n - 1)