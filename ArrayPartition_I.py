# TC: O(N logN) since we are sorting the array before processing it. 
# SC: O(1) as we do not use any extra space.

class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
#         sort the array in ascending order

        nums.sort()
    
#         return the alternate elements from each consecutive pair, thereby returning the max sum
        sum = 0
        for i in range(0,len(nums),2): 
            sum += nums[i]
        
        return sum
