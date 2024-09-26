'''
Time Complexity :O(n) 
Space Complexity :O(1)
Did this code successfully run on Leetcode : yes
Any problem you faced while coding this :no
'''
class Solution:
    
    def reverseList(self,ptr1,ptr2,nums):
        while ptr1<= ptr2:
            # swap ptr1 and ptr2
            nums[ptr1],nums[ptr2] = nums[ptr2],nums[ptr1]
            ptr1 += 1
            ptr2 -= 1
        return nums
    
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        # step 1: find the breech
        breechIdx = -1
        for idx in range(len(nums)-2,-1,-1):
            if nums[idx] < nums[idx+1]:
                # I have my breech
                breechIdx = idx
                break
        print("1. Breeach Idx is:\t",breechIdx)
        
        # base-case
        # if breechIdx == -1, I dont have any breech
        if breechIdx == -1:
            return self.reverseList(0,len(nums)-1,nums)
                
        # step 2: find the lowest possible maxima 
        maximaIdx = None
        for idx in range(breechIdx+1,len(nums),1):
            if nums[breechIdx] < nums[idx]:
                if maximaIdx == None:
                    maximaIdx = idx
                elif nums[maximaIdx] >= nums[idx]:
                        maximaIdx = idx                    
        print("2. maximaIdx is:\t",maximaIdx)
        
        # step 3: swap the maxima with breechIdx and return the result
        nums[maximaIdx],nums[breechIdx] = nums[breechIdx],nums[maximaIdx]
        print("3. Swapped Result is:\t",nums)
        
        # step 4: reverse the list from breechIdx+1 to len(nums)
        return self.reverseList(breechIdx+1,len(nums)-1,nums)