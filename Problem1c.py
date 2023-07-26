class Solution(object):
    def arrayPairSum(self, nums):
        """
        Find the maximum sum of pairs from the given list using bucket sort with a hashmap.

        Time complexity: O(n)
        Space complexity: O(n)

        :type nums: List[int]
        :rtype: int
        """
        num_freq_map = {}
        minimum = float('inf')  # Initialize minimum with positive infinity.
        maximum = float('-inf')  # Initialize maximum with negative infinity.

        for num in nums:
            minimum = min(minimum, num)  # Update minimum.
            maximum = max(maximum, num)  # Update maximum.
            # Count frequency of each number.
            num_freq_map[num] = num_freq_map.get(num, 0) + 1

        result = 0
        j = 0
        i = minimum

        # Loop through the range from minimum to maximum to form pairs and maximize the sum.
        while i <= maximum:
            if i in num_freq_map:
                # Get the frequency of the current number.
                freq = num_freq_map[i]
                while freq > 0:
                    if j % 2 == 0:
                        # If even index, include the current number in the sum.
                        result += i
                    j += 1  # Increment the index for next pair.
                    freq -= 1  # Decrement the frequency of the current number.

            i += 1  # Move to the next number in the range.

        return result  # Return the maximum sum of pairs.
