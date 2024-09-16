# Time Complexity: O(n)
# Space Complexity: O(1)
class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        def rev(i):
            l=i
            h=len(nums)-1
            while l<=h:
                nums[l],nums[h]=nums[h],nums[l]
                l+=1
                h-=1
        i=len(nums)-2
        while i>=0 and nums[i]>=nums[i+1]:
            i-=1
        if i!=-1:
            for j in range(len(nums)-1,i,-1):
                if nums[j]>nums[i]:
                    nums[j],nums[i]=nums[i],nums[j]
                    break
        rev(i+1)