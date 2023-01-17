#time complexity: O(nlogn)
#space complexity: O(1)
#ran on leetcode :Yes
#sort the array. every 2 elements is the pair. get the sum of all odd indexes since these will be the min in the pairs.
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        i=0
        s=0
        while(i<len(nums)):
            s+=nums[i]
            i+=2
        return s
