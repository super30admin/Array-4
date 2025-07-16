"""
Traverse from the end to find the first i where nums[i] < nums[i+1]
Then find the smallest number greater than nums[i] to its right and swap them
Finally, reverse the subarray after index i to get the next smallest permutation
"""
"""
Time Complexity : O(n)
Space Complexity : O(1) (in-place)
"""

class nextPermutation:
    def nextP(self, nums: list[int]) -> None:
        n = len(nums)
        i = n - 2

        while i >= 0 and nums[i] >= nums[i + 1]:
            i -= 1

        if i >= 0:
            j = n - 1
            while nums[j] <= nums[i]:
                j -= 1
            nums[i], nums[j] = nums[j], nums[i]

        left, right = i + 1, n - 1
        while left < right:
            nums[left], nums[right] = nums[right], nums[left]
            left += 1
            right -= 1

if __name__ == "__main__":
    arr = [1, 2, 3]
    nextPermutation().nextP(arr)
    print(arr)

