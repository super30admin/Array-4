class Solution(object):
    def maxSubArray(self, nums):
        """
        In the below code start and end indexes will help us produce the subarray giving maxSum.
        Time Complexity - O(n)
        Space complexity - O(1)
        :type nums: List[int]
        :rtype: int
        """
        if not nums:  # Handle the case when the input list is empty.
            return 0

        # Initialize the current sum and maximum sum with the first element.
        currSum = nums[0]
        maxSum = nums[0]

        # Variables to store the starting and ending index of the maximum subarray.
        start = 0
        start_curr = 0
        end = 0

        # Loop through the remaining elements in the list.
        for i in range(1, len(nums)):
            currSum += nums[i]
            # If the current element makes the subarray bigger, start a new subarray.
            if currSum < nums[i]:
                currSum = nums[i]
                start_curr = i

            # If the current subarray has a bigger sum, update the maxSum and indexes.
            if maxSum < currSum:
                maxSum = currSum
                start = start_curr
                end = i
        print(start)
        print(end)
        return maxSum  # Return the maximum sum found.
