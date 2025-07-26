# Time complexity: O(n log n) due to sorting
# Space complexity: O(n) 
def arrayPairSum(nums):
    nums.sort()
    return sum(nums[::2])
