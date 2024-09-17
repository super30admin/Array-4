class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        """
        TC:O(nlogn +n)=O(nlogn)
        SC:O(1)
        """
        nums.sort()
        summ=0
        for i in range(0,len(nums),2):
            summ+=nums[i]
        return summ
        