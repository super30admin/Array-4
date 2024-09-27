"""
https://leetcode.com/problems/next-permutation/submissions/
"""
class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        generate all permutations and then sort them
        and then find the next permutation after the given numbert in that sorted list


       arr=3 1 4 8 7 6 2 1
       asnwer=3 1 6 1 2 4 7 8
        see right is greater than left, wherever it is lesser breach has happened start from last index -1 , 2 >1, 6>2, so 6>1 8>7 till left is greater than right but at the place of 4 breach has happened now we know the break place

        1. Find the breach (4)
        2. Find which digit to replace it with(iterate from righr and find number greater than the breach, as soon as we find it we found the replacement) (6) replace
        til now array is 3 1 6(ptr) 8 7 4 2 1
        3. reverse  the remaining numbs after ptr
        TC:O(n)
        """
        n = len(nums)
        ###find the breach
        i = n - 2
        while i >= 0:
            if nums[i] < nums[i + 1]:
                break
            i -= 1

        j = n - 1
        ###find the replacement
        # if there's a breach
        if i >= 0:
            while nums[j] <= nums[i]:
                j -= 1
            nums[i], nums[j] = nums[j], nums[i]
        ##reverse to be handled anyhow
        self.reverse(nums, i + 1, n - 1)
        return nums

    def reverse(self, nums, index, lindex):
        while index < lindex:
            nums[index], nums[lindex] = nums[lindex], nums[index]
            index += 1
            lindex -= 1
        return nums







