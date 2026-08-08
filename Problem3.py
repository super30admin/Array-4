## Problem3  Next permutation(https://leetcode.com/problems/next-permutation/)
class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        
        -------------------------------------------------------------------------
        Time Complexity: O(N)
        - Step 1 (Finding the first decreasing element): Scans the array backwards 
          at most once -> O(N).
        - Step 2 (Finding the element just greater): Scans the array backwards 
          at most once -> O(N).
        - Step 3 (Swap): Performed in O(1) time.
        - Step 4 (Reverse suffix): Reverses at most N elements -> O(N).
        Total Time Complexity = O(N) + O(N) + O(1) + O(N) = O(N), where N is len(nums).

        Space Complexity: O(1)
        - All operations (swapping and reversing) are done in-place without allocating 
          extra data structures.
        -------------------------------------------------------------------------
        """
        n = len(nums)

        # Helper function to reverse a subarray in-place from index l to r
        def reverse(l: int, r: int) -> None:
            while l < r:
                nums[l], nums[r] = nums[r], nums[l]
                l += 1
                r -= 1

        # Step 1: Find the first pair (nums[i], nums[i + 1]) from the right 
        # such that nums[i] < nums[i + 1]. 
        # This identifies the pivot element 'i' that needs to be increased.
        i = n - 2
        while i >= 0:
            if nums[i] < nums[i + 1]:
                break
            i -= 1

        # If no such element is found (i == -1), the array is sorted in descending order.
        # This means it is the last permutation, so we reverse it to get the smallest 
        # lexicographical order (first permutation).
        if i == -1:
            reverse(0, n - 1)
            return

        # Step 2: Find the smallest element in the right suffix (from n-1 down to i+1) 
        # that is strictly greater than nums[i].
        j = n - 1
        while j > i:
            if nums[j] > nums[i]:
                break
            j -= 1

        # Step 3: Swap the pivot element nums[i] with nums[j] to create 
        # the next lexicographically larger prefix.
        nums[i], nums[j] = nums[j], nums[i]

        # Step 4: Reverse the suffix starting at index i + 1.
        # Since the suffix after index i was in strictly descending order, 
        # reversing it transforms it into ascending order, ensuring the smallest possible 
        # permutation for the remaining elements.
        reverse(i + 1, n - 1)