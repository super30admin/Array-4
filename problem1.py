#Time O(nlogn), spaceO(1)
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        sum=0
        #Sorting the array and calculating sum of alternate values
        nums.sort()
        for i in range(0,len(nums),2):
            sum+=nums[i]
            
        return sum
