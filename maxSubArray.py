# TimeComplexity:O(n)
# SpaceComplexity: constant
# Approach: at every number you have 2 choices either start sum with that number or let the number be part of subarry but as we need max we update our running sum only if rsum+nums[i] is less
# than nums[i]
# Brute force would be find all subarrays O(n^3)
# to find index you might thing to update start and end when rsuma dn max gets upadated but thats not tottaly correct for rsum get updated evry time when nums[i] is greater than sum
# which is local but we need global so we have curr start and start (for global)/




class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        rsum,mx=0,nums[0]
        start,currstart=0,0
        end=0
        for i in range(len(nums)):
            rsum+=nums[i]
            if nums[i]>rsum:
                rsum=nums[i]
                currstart=i

            if rsum>mx:
                end=i
                start=currstart

                mx=max(mx,rsum) 
        print(start,end)
        return mx
        
