'''
Accepted on leetcode(31)
time - O(N)
space - O(1)
Approach:
while traversing from last element in a given array:
1. find an element that is less than next element.
2. find another element that is greater than the elemnt first found.
3. swap between 1st and 2nd found elements.
4. Then, reverse after 1st element.
'''


class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        i = len(nums) - 2

        # find first element that is less than next element.
        while i >= 0 and nums[i] >= nums[i + 1]:
            i -= 1

        j = len(nums) - 1
        # find second element that is greater than first element.
        if i >= 0:
            while j >= 0 and nums[i] >= nums[j]:
                j -= 1
            self.swap(nums, i, j)
        self.reverse(nums, i + 1, len(nums) - 1)

    # function swap elements.
    def swap(self, nums, i, j):
        temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp

    # function reverse the list using swap function.

    def reverse(self, nums, i, j):
        while i < j:
            self.swap(nums, i, j)
            i += 1
            j -= 1