class Solution:
    def maxSubArray(self, nums: List[int]) -> int:

        #Method 1 - generate all possible subarrays and get the max. - TC N^3

        #Method 2 - O(n) - #Optimized brute force - O(n)
        #here, we calculate sum of current subarray at each element, if my current subarray's sum is negative or less than the new element, discard it and set it to new element.
        maxi=nums[0]
        currsum=nums[0]
        for i in range(1,len(nums)):
            currsum=max(nums[i],currsum+nums[i]) #if currsum is negative discard, else keep adding to it.
            maxi=max(maxi,currsum) #just update maxi each i
        return maxi
       