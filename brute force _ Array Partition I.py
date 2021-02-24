#time: O(nlogn)
#space: O(1)

#brute force
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        n=len(nums)
        nums=sorted(nums)
        sum=0
        i=0
        while(i<n):
            sum+=nums[i]
            i+=2
        return sum
