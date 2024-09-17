#Time Complexity: O(NlogN)
#Space Complexity: O(1)
def arrayPairSum(self, nums: List[int]) -> int:
    if not nums:
        return 0
    nums.sort()
    result = 0
    for i in range(0, len(nums), 2):
        result += nums[i]
    return result