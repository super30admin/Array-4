## Problem1 Array partition (https://leetcode.com/problems/array-partition/)
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        """
        TIME COMPLEXITY:
        - O(N + K)
          Where N is the length of `nums` (to build `count`) and K is the range of 
          values (maxNum - minNum + 1).

        SPACE COMPLEXITY:
        - O(U)
          Where U is the number of unique elements in `nums` stored in `count`.
        """
        # Count frequency of each number
        count = Counter(nums)
        
        # Find the search range boundaries
        minNum, maxNum = min(count), max(count)
        
        # Flag tracks if current element pairs with a previously leftover smaller number (False) 
        # or starts a new pair / adds to res (True)
        flag = True
        res = 0

        # Iterate through all values in range from minimum to maximum number
        for i in range(minNum, maxNum + 1):
            # Adjust frequency if one instance of `i` was already used to pair with a smaller number
            freq = count[i] + (-1 if flag == False else 0)

            # If remaining count is even, all remaining instances pair up internally
            if freq % 2 == 0:
                # Add the sum contribution of internal pairs
                res += (freq // 2) * i
                # No leftover element, next number starts fresh
                flag = True
            # If remaining count is odd
            else:
                # Add one instance of `i` to the result (paired with next available larger number)
                res += i
                # Add the sum contribution of internal pairs
                res += (freq // 2) * i
                # One instance of `i` remains unpaired for the next iteration
                flag = False

        return res


        """
        TIME COMPLEXITY:
        - O(N log N)
          Sorting takes O(N log N) time, and the subsequent loop takes O(N) time.

        SPACE COMPLEXITY:
        - O(N) or O(1)
          Python's Timsort uses up to O(N) temporary storage in the worst case.
        """
        # Sort array so adjacent numbers form optimal pairs with minimal wasted value
        nums.sort()
        
        res = 0
        i = 0
        
        # Iterate over every even index since nums[2i] is always min(nums[2i], nums[2i+1])
        while i < len(nums):
            # Add the minimum of the pair to total sum
            res += nums[i]
            # Jump to the start of the next pair
            i += 2

        return res