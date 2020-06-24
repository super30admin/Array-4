#time Complexity: O(n)
#Space Complexity: O(1)
'''
If our sum becomes smaller than a number when we add that number to the sum,
then it's better to start the sum at that number instead. with this logic, we
traverse while updating the max sum.
'''
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        max_sum,sum_,all_negative=float("-inf"),0,True
        for num in nums:
            sum_=max(num,sum_+num)
            max_sum=max(sum_,max_sum)
        return max_sum
