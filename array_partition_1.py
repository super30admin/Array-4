#Time complexity: O(nlogn)
#Space Complexity: O(1)
'''
We can easily see that the optimal way of pairing them is to pair them
with the closest number possible.Since we're taking the min,
it would be a waste to pair a small number with a number way larger.
To do that, we simply sort the array, then the minimum of each pair of
2 (even indices) are the values for the pair.
'''
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        sum_=0
        for i in range(len(nums)):
            if i%2==0:sum_+=nums[i]
        return sum_
        
