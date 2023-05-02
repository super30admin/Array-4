class Solution:
    #TC-O(nlogn),SC-O(1)
    #sort the nums so that the second no in the pairing i.e wastage is minimised
    def arrayPairSum(self, nums: List[int]) -> int:
        nums=sorted(nums)
        s=0
        for i in range(0,len(nums),2):
            s+=nums[i]
        return s

