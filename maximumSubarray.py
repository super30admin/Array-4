#Time Complexity: O(N)
#Space Complexity: O(1)
def maxSubArray(self, nums: List[int]) -> int:
    result, currsum = float("-inf"), 0
    for i in nums:
        currsum += i
        result = max(currsum, result)
        if currsum < 0:
            currsum = 0
    return result