"""
TC: O(N+K) iterate over N to find min max, then iterate over range K- range of elements
SP: O(N) to store freq map
"""
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        mini = min(nums)
        maxi = max(nums)
        hmap = Counter(nums)
        take_next = True
        res = 0
        for i in range(mini, maxi+1):
            while i in hmap:
                if take_next:
                    res+=i
                hmap[i]-=1
                if hmap[i]==0:
                    del hmap[i]
                take_next = not take_next
        return res
                