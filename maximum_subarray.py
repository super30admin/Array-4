# // Time Complexity :O(n) 
# // Space Complexity :O(1) 
# // Did this code successfully run on Leetcode :yes
# // Any problem you faced while coding this :no


class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        rsum=nums[0]
        maxx=nums[0]
        star=0
        end=0
        currstart=0
        for i in range(1,len(nums)):
            if rsum+nums[i]>nums[i]:
                rsum=rsum+nums[i]
                print(i)
            else:
                rsum=nums[i]
                currstart=i
            
            if rsum>maxx:
                maxx=rsum
                star=currstart
                end=i
        print(nums[star:end+1])
            
            
        return maxx