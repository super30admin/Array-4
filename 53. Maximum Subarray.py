##53. Maximum Subarray#######################################################################################
// Time Complexity : O(n)
// Space Complexity : O(1) -> no extra space 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : no problem

// Your code here along with comments explaining your approach in three sentences only
We used a sliding window technique, where we start caculating rolling sum, when we encounter and element we see if the new element is greater than rolling sum if yes than we reinitialize rolling sum with current elementt as first element


class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        #initialise param for rolling and max sum
        maxsum=-inf
        currsum=-inf
        #startidx,endidx=0,0
        #sliding window throug array
        for i in range(len(nums)):
            #check is rolling sum is greater than next number individually
            currsum=max(nums[i],currsum+nums[i])
            #update max sum
            maxsum=max(maxsum,currsum)
            '''if nums[i]>=currsum+nums[i]:
                currsum=nums[i]
                startidx=i
            else:
                currsum+=nums[i]
            if currsum>maxsum:
                maxsum=currsum
                endidx=i
        print(nums[startidx:endidx+1])'''
        return maxsum
            
            
            
            

        
        
