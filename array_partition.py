# // Time Complexity :O(nlogn) ,sorting
# // Space Complexity :O(1) 
# // Did this code successfully run on Leetcode :yes
# // Any problem you faced while coding this :no



class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums=sorted(nums)
        print(nums)
        summ=0
        for i in range(0,len(nums),2):
            summ=summ+nums[i]
        return summ
            
        