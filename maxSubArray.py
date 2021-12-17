#Time complexity : O(n)
#Space complexity : O(1)
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
       
        ## Kadane's Algorithm
        smart =  nums[0] # all negative case
        greedy = 0
        
        for i in range(0, len(nums)):
            
            # select whatever that it is received
            greedy += nums[i]
            
            # update the smart if greedy has higher
            if greedy > smart :
                smart = greedy
            
            # if the greedy is neg, it indicates the running sum of this subarray is <0.
            # So, dont contribute these elements to the result subarray
            if greedy < 0:
                greedy = 0
                
        return smart
        