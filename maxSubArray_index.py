"""
Time complexity O(N)
Space complexity O(1)

-Compare the current index num[i] and rsum+num[i] and see which is maximum and start the subarray from that 
-Compare max between prev max and rsum

"""

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        if not nums:
            return 0
        rsum=nums[0]
        max1=nums[0]
        currStart=0
        for i in range(1,len(nums)):
            if(nums[i]>nums[i]+rsum):
                currStart=i
                rsum=nums[i]
            else:
                rsum=nums[i]+rsum
            if(rsum>max1):
                max1=rsum
                start=currStart
                end=i
        #print(start)
        #print(end)
        return max1
                
            