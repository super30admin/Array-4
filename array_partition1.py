#Time complexity : O(nlogn)
#Space complexity : O(1)
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        
        sumVal = 0
        # As the left out in partition is not contributing in the Max Sum,
        # we need to place a smaller num in the partition to maximize the sum as much as possible 
        # This results in always creating the partitions as per the sorting order.
        nums = sorted(nums)
        
        # alternate elements in odd indices are the left outs in the partitions(not contributing in the sum)
        for i in range(0, len(nums), 2) :
            sumVal += nums[i]
            
        return sumVal