class Solution(object):
    def arrayPairSum(self, nums):
        """
        Time complexity - O(nlogn)
        Space complexity - O(1)

        :type nums: List[int]
        :rtype: int
        """
        nums.sort()  # Step 1: Sort the given list in ascending order.
        result = 0  # Initialize the variable to store the sum of pairs.

        # Step 2: Loop through the sorted list by considering every alternate element (pair).
        for i in range(0, len(nums), 2):
            # Add the element to the result as it forms a pair with the next element.
            result += nums[i]

        return result  # Return the maximum sum of pairs.
