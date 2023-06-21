# TC: O(n)
# SC: O(1)

class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        
        n=len(nums)

        pivot=0

        for i in range(n-1,0,-1):
            if nums[i-1]<nums[i]:
                pivot=i
                break
        
        if pivot==0:
            return nums.sort()

        swap=n-1

        while nums[pivot-1]>=nums[swap]:
            swap-=1
        
        nums[pivot-1],nums[swap]=nums[swap],nums[pivot-1]
        nums[pivot:]=reversed(nums[pivot:])
            
        