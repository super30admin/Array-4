#  https://leetcode.com/problems/next-permutation/


class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        i = n-2
        # finding the no which needs to be changed
        while i>=0 and nums[i] >= nums[i+1]:
            i-=1
        
        if i >=0:
            j = n-1
            while nums[i] >= nums[j]:
                j-=1
            self.swap(nums,i,j)

        nums[i+1:] = nums[i+1:][::-1]

# TC: O(n) --> n for i, n for j, n for reverse --> 3n but O(n)
# SC: O(1) ..> inplace
        

    def swap(self,nums,i,j):
        temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp


        