class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        """
        T: O(N*logN)
        S: O(logN): - Used by sort()
        """
        nums.sort()
        s = 0
        for i in range(0, len(nums), 2):
            s += nums[i]
        
        return s