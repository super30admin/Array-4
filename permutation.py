
#Time Complexity: O(N)
#Space Complexity: O(1)
#Run on Leetcode: Yes
#Any Issues: No

class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        pos = 0
        flipped = False
        for i in range(len(nums)-2, -1, -1):
            for j in range(len(nums)-1, i, -1):
                if(nums[i] < nums[j]):
                    nums[i],nums[j] = nums[j],nums[i]
                    pos = i+1         
                    flipped = True
                    break
            if(flipped):
                break
        
        while(pos<len(nums)):
            for i in range(pos+1,len(nums)):
                if(nums[i] < nums[pos]):
                    nums[i],nums[pos] = nums[pos],nums[i]
            pos += 1

       
        