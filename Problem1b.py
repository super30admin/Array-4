class Solution(object):
    def arrayPairSum(self, nums):
        """
        WITHOUT USIGN sort()
        Time complexity - O(n)
        Space complexity - O(n) 

        :type nums: List[int]
        :rtype: int
        """
        # Create a hashmap to store the frequency of each unique element in the nums list.
        num_freq_map = {}

        # Traverse the nums list and populate the hashmap.
        for num in nums:
            num_freq_map[num] = num_freq_map.get(num, 0) + 1

        result = 0
        is_even = True

        # Loop through the unique elements present in the nums list and form pairs to maximize the sum.
        # Sort the unique elements for a better loop order.
        for num in sorted(num_freq_map.keys()):
            # Get the frequency of the current number.
            freq = num_freq_map[num]

            # Form pairs and accumulate the maximum sum of the minimum elements in pairs.
            while freq > 0:
                # If even, consider the number as the minimum element of the pair.
                if is_even:
                    result += num

                # Switch to the other number for the next pair.
                is_even = not is_even
                freq -= 1  # Decrease the frequency for the current number.

        return result  # Return the maximum sum of pairs.
