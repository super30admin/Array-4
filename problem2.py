#time complexity :O(n)
#space complexity:O(1)
#ran on leetcode: Yes
#Track tjhe cumultive sum i the array. When cumulative sum becomes negative, then reset it to zero. Track the biggest numeber seen so far and return it after iterating through all elements.
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        r_sum=0
        best=-100000
        for i in nums:
            r_sum+=i
            best=max(best,r_sum)
            if(r_sum<0):
                r_sum=0
            
        return best

