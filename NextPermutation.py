'''
    Time Complexity:
        O(n)

    Space Complexity:
        O(1)

    Did this code successfully run on LeetCode?:
        Yes

    Problems faced while coding this:
        None

    Approach:
        From the end, find the index of the first number that is in decreasing order. Let's call it i.
        If i >= 0:
            From the end, find the index of the first number that is greater than the number at i. Let's call it j.
            Swap the numbers at i and j.
        Reverse the numbers starting from i+1.
'''

class Solution:
    def __init__(self):
        self.nums = []

    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        self.nums = nums

        i = self.find_first_decreasing()
        if i >= 0:
            j = self.find_first_greater(i)
            self.swap(i, j)
        self.reverse(start=i+1)

    def find_first_decreasing(self):
        i = len(self.nums) - 2
        while i >= 0:
            if self.nums[i] < self.nums[i + 1]:
                break
            i -= 1
        return i

    def find_first_greater(self, i):
        num = self.nums[i]
        j = len(self.nums) - 1

        while j >= 0:
            if self.nums[j] > num:
                break
            j -=1

        return j

    def swap(self, i, j):
        self.nums[i], self.nums[j] = self.nums[j], self.nums[i]

    def reverse(self, start):
        i = start
        j = len(self.nums) - 1

        while i < j:
            self.swap(i, j)
            i += 1
            j -= 1
