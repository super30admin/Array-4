'''
Solution:
1.  Find the first descending element from the right. Store the value.
2.  Find the index of first greater element compared to the value we stored previously.
3.  Swap these tow indices and reverse from the next index of the first descending element.

Time Complexity:    O(n)    |   Space Complexity:   O(1)
--- Passed all testcases on Leetcode successfully
'''

class NextPermutation:

    def __reverse(self, nums, start, end):

        #   function to reverse a chunk of an array
        while (start < end):
            self.__swap(nums, start, end)
            start += 1
            end -= 1

    def __swap(self, nums, left, right):

        #   function to swap elements at two indices
        temp = nums[left]
        nums[left] = nums[right]
        nums[right] = temp

    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """

        #   edge case check
        if (nums == None or len(nums) <= 1):
            return

        #   initializations
        n = len(nums)
        firstDown = n - 2

        #   iterate until we find first descending element
        while (firstDown >= 0 and nums[firstDown] >= nums[firstDown + 1]):
            firstDown -= 1

        #   if index is < 0 => reverse the entire array [3 2 1] -- > [1 2 3]
        #   else - find next greater element's index from right, swap first down index with this index
        if (firstDown >= 0):
            nextMax = n - 1
            while (nums[nextMax] <= nums[firstDown]):
                nextMax -= 1
            self.__swap(nums, firstDown, nextMax)

        #   reverse from the index of first descending element
        self.__reverse(nums, firstDown + 1, n - 1)

        return