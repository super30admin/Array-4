# PROBLEM 31. NEXT PERMUTATION
# TIME COMPLEXITY: O(N) where N is the size of an array
# SPACE COMPLEXITY: O(1) as we are not taking any space into consideration

class Solution:
    def nextPermutation(self, nums: list[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n=len(nums)
        # findMaxPos=-1
        # findMax=float('-inf')
        # for i in range(n,-1,-1):
        #     if findMax>nums[i]:
        #         findMaxPos=i
        pos=-1
        for i in range(n-1,0,-1):
            if nums[i-1]<nums[i]:
                pos=i-1
                break
        if pos==-1:
            nums[:]=nums[::-1]
            return
        
        toSwapPos=-1
        toSwapNum=float('inf')
        for i in range(n-1,pos,-1):
            if nums[i]>nums[pos]:
                if nums[i]<toSwapNum:
                    toSwapNum=nums[i]
                    toSwapPos=i

        temp=nums[pos]
        nums[pos]=nums[toSwapPos]
        nums[toSwapPos]=temp

        nums[pos+1:]=nums[pos+1:][::-1]