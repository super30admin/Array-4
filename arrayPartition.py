# Time:O(n+(max-min)) 2 pass
# Space:O(max-min) for the hashmap
# Leetcode: yes
# Issues:No 

# Bucket Sort and then iterate over min/max
class Solution:
    def arrayPairSum(self, nums: list[int]) -> int:
        if not nums:
            return 0

        n = len(nums)
        res = 0
        hmap = {}
        mini = float('inf')
        maxi = -float('inf')
        
        for i in range(n):
            hmap[nums[i]] = hmap.get(nums[i],0) +1
            mini = min(mini, nums[i])
            maxi = max(maxi, nums[i])

        flag = False
        for i in range(mini,maxi+1):
            if i not in hmap:                      # unnecessary numbers included traversing through range
                continue
            
            if flag:                                        # odd element last used, removed 1 from next iteration
                hmap[i] -= 1
                flag = False

            frq = hmap[i]                           # hashmap not nums[i]

            if frq%2 == 0:
                res += frq//2 * i
            else:                                   # odd found
                res += frq//2 * i
                res += i 
                flag = True
        return res 
    
# Iterate sorted jump 2 //Time:O(nlogn) Space:O(n)
class Solution:
    def arrayPairSum(self, nums: list[int]) -> int:
        x = sorted(nums)
        n = len(nums)
        res = 0
        for i in range(0,n,2):
            res += x[i]
        return res
    
# 1 liner
class Solution:
    def arrayPairSum(self, nums: list[int]) -> int:
        return sum(sorted(nums)[::2])