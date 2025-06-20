#Brute force - Time limit exceeded 
#Generate all sub string and get maximum
#TC: O(n^2)
#SC: O(1)
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        maxi = nums[0]
        for i in range(0, len(nums)):
            total = nums[i]
            maxi = max(maxi, total)
            for j in range(i+1,len(nums)):
                total += nums[j]
                maxi = max(maxi,total)
        
        return maxi
        

#TC: O(n)
#SC: O(1)
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        maxi = nums[0]
        curr = nums[0]
        for i in range(1, len(nums)):
            curr = max(curr+nums[i], nums[i])
            maxi = max(maxi, curr)
        
        return maxi
        
#TC: O(n)
#SC: O(1)
#2 pointers
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        s = 0
        e = s+1
        n= len(nums)
        total = nums[s]
        curr = nums[s]
        while(s<n and e<n):
            if nums[e]>nums[e]+curr:
                total = max(total, nums[e])
                curr = nums[e]
                s = e
                e = e+1
            else:
                curr += nums[e]
                total = max(total, curr)
                e = e+1
        return total

