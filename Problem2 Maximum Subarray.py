#Problem 2:https://leetcode.com/problems/maximum-subarray/
#Test Cases passed on Leetcode 
#Time Complexity:    O(n) 
#Space Complexity:   O(1)


class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        #In this approach, we , maintain a global max, and take the max of current window's sum-Local Maximum Sum and current element, then find the max of local maximum sum and global maxiumum sum
   
        locSum=nums[0]
        globalSum=nums[0]
        for i in range(1,len(nums)):
            locSum=max(nums[i],locSum+nums[i])
            globalSum=max(locSum,globalSum)
        return globalSum
    
    #Approach in case we need to find the subarray as well
    if not nums or len(nums)==0:
        return 0
    
    maintain these two posinters for getting max subarray
    
        start=0
        end=0

        maxSum=nums[0]
        #Running Sum
        rSum=nums[0]
        k=0
        for i in range(1,len(nums)):
            rSum=nums[i]+rSum
            #in case when current element value is greater than running sum
            if rSum<nums[i]:
                rSum=nums[i]
                k=i
            if rSum>maxSum:
                maxSum=rSum
                start=k
                end=i
        print("start of max subarray: ",start)
        print("end of max subarray: ", end)
        return maxSum
