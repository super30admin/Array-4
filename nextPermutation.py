# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        ptr1  = len(nums) - 2
        ptr2  = len(nums) - 1

        while ptr1 <= ptr2 :

            if ptr1 ==  -1 :
                return nums.reverse()

            if nums[ptr1] < nums[ptr1+1]:
                for i in range(ptr2 , ptr1 , -1):
                    if nums[i] > nums[ptr1] :
                        nums[i] , nums[ptr1] = nums[ptr1] , nums[i]
                        nums[ptr1+1:] = nums[ptr1+1:][::-1]
                        return nums


            ptr1 -= 1
