"""
At every index we are trying to figure out if it should be added to the subarray or we can start a new subarray from that index

We maintain a running sum to add all the elements of the subarray and a max to check for the max running sum

TC = O(n)
SC = O(1)
"""
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        if nums is None :
            return None
        sMax = nums[0]
        rSum = nums[0]
        p = 0
        n = len(nums)
        
        for i in range(1,n):
            rSum = max(nums[i], rSum+nums[i])
  
            sMax = max (rSum, sMax)
            
        return sMax


"""
To return the sub array start and end points

"""
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        if nums is None :
            return None
        sMax = nums[0]
        rSum = nums[0]
        
        start = 0
        end = 0
        
        n = len(nums)
        
        for i in range(1,n):
            if nums[i]>rSum+nums[i]:
                start = i
                rSum = nums[i]
            else:
                rSum = rSum+nums[i]
               
            if rSum>sMax:
                sMax = rSum
                start = start
                end = i
            sMax = max (rSum, sMax)
        print(start)
        print(end)
        return sMax