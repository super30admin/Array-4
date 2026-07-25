# https://leetcode.com/problems/array-partition/description/

class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:

        res = 0

        nums = sorted(nums)

        for i in range(0, len(nums), 2):
            res += nums[i]

        return res

# Hashmap solution   
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        hm = {}
        res = 0
        nums = sorted(nums)
        mini = 9999
        maxi = -1

        for num in nums:
            if num in hm:
                hm[num] += 1
            else:
                hm[num] = 1
            mini = min(mini, num)
            maxi = max(maxi, num)

        flag = False 

        for num in range(mini, maxi+1):
            if num not in hm: continue 
            if flag:
                hm[num] -= 1

            multiplier = hm[num] // 2
            res += multiplier * num

            if hm[num] % 2 != 0:
                res += num
                flag = True
            else:
                flag = False 

        return res

