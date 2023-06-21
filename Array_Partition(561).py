class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        # T.C. = O(nlogn) #TC to sort the array
        # S.C. = O(1)
        # Here if we want to maximize the minimum we need to sort such that
        # the greater element is placed next to the just smaller element
        # In the approach we first sort the array
        # then take the first element in the pair and skip the 2nd/greater element
        # in the pair
        if((nums is None) or (len(nums)==0) or (len(nums)%2!=0)):
            return 0

        size = len(nums)
        nums.sort()
        ans = 0
        idx = 0

        while idx<size:
            ans += nums[idx]
            idx+=2

        return ans