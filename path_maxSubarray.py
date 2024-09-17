class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        """
        TC:O(n)
        SC:O(1)
        """
        
        runsum=nums[0]
        maxx=nums[0]
        cur=0
        for i in range(1,len(nums)):
            if nums[i]>nums[i]+runsum:
                runsum=nums[i]
                cur=i
            else:
                runsum=nums[i]+runsum
            if runsum>maxx:
                maxx=runsum
                start=cur
                
                end=i
                
        print(start)
        print(end)
        return maxx
            
       