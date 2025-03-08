# For this we sort the array and then add the first element of each pair to the total sum. The first element of each pair will be the minimum of the two elements in the pair.
# Time Complexity: O(nlogn)
# Space Complexity: O(1)

class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        total = 0
        for i in range(0, len(nums), 2):
            total = total + nums[i]

        return total