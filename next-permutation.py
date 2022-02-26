'''
TC: O(n)
SC: O(1)

Intuition:

- start from back, compare two at a time
- find a breach where l < r
- find the next greater or equal element from l to n - 1
- swap
- reverse from the swapped element onwards

'''
class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
                
        nlen = len(nums)
        
        if nlen <= 1:
            return nums
        
        r = nlen - 1
        l = r - 1
        
        while l >= 0:
            if nums[l] < nums[r]:
                break
            l -= 1
            r -= 1
        
        if l < 0:
            nums[:] = nums[::-1]
            return nums
        
        minm = nlen - 1
        while nums[l] >= nums[minm]:
            minm -= 1
        nums[l], nums[minm] = nums[minm], nums[l]
        nums[l+1:nlen] = nums[l+1:nlen][::-1]
        
        return nums