class Solution(object):
    def maxSubArray(self, nums):
        """
        Time complexity is O(n)
        Space complexity- O(1) 
        :type nums: List[int]
        :rtype: int
        """
        if not nums:  # Handle the case when the input list is empty.
            return 0

        currSum = maxSum = nums[0]  # Initialize both current sum and maximum sum with the first element.

        for num in nums[1:]:  # Loop through the remaining elements in the list.
            # Calculate the current sum by taking the maximum of the current number and the previous sum plus the number.
            currSum = max(num, currSum + num)

            # Update the maximum sum if the current sum is greater.
            maxSum = max(maxSum, currSum)

        return maxSum  # Return the maximum sum found.