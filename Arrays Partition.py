#// Time Complexity : O(nlogn) 
# // Space Complexity : O(1) 
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : No.

class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        result = 0
        for i in range(0,len(nums),2):
            result += nums[i]
        return result

# Approach:
# 1. Sort the input array in ascending order.
# 2. Initialize a variable `result` to store the sum of the pairs.
# 3. Iterate over the sorted array with a step of 2
# 4. In each iteration, add the current element to the `result` variable.
# 5. Return the `result` variable as the sum of the pairs.

# the approach here is that as we have to maximize the sum of minimums so of we sort and take alternate elements then we can directly 
# add them to result because they will be the minimum in group of 3