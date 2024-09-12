# Time Complexity: O(nlogn)
# Space Complexity: O(1)
class Solution:
    def arrayPairSum(self, nums):
        n = len(nums)
        #         We will sort the array and then we will move the pointer by 2 and will take first ith
        #         index as it is sorted and add ith index value to array and result the max_sum
        nums.sort()
        max_sum = 0
        for i in range(0, n, 2):
            max_sum += nums[i]

        return max_sum
