#Time -> O(n)
#Space -< O(1)

class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        
        #Sort the array
        nums.sort()
        res=0
        #Iterate thriugh the interval of 2 and add the min of them to the result
        for i in range(1,len(nums),2):
            res+=min(nums[i-1],nums[i])
            
        return res
    
    
        #Alternate python Solution
        # nums.sort()
        # return sum(nums[::2])