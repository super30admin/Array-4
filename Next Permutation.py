#Time Complexity: O(len(nums)) = O(n) = O(1/
#Space Complexity: O(1)
class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if not nums:
            return
        i = len(nums)-2
        
        while(i>=0 and nums[i]>=nums[i+1]):
            i -= 1
        # Now is at breach
        if i!=-1:
            j = len(nums)-1
            while(nums[i] >= nums[j]):
                j -= 1
            nums[i],nums[j] = nums[j],nums[i]
            
        def reverse(nums,l,r):
            while(l < r):
                nums[l],nums[r] = nums[r],nums[l]
                l += 1
                r -= 1
            
        
        reverse(nums,i+1,len(nums)-1)     