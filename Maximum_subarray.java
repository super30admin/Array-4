TC:O(n)
SC:O(1)

Runtime: 64 ms, faster than 92.91% of Python3 online submissions for Maximum Subarray.

Approach: Kadane's Algorithm.

class Solution:
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        ans,sum=0,0
        flag=0
        for i in nums:
            if i>0:
                flag=1 # there has to be atleast one positive numberr
        if flag==0:
            return max(nums)
        for i in nums:
            if i+sum<0:
                sum =0
            else:
                sum=sum+i
            if sum>ans:
                ans=sum
        return ans
