# Time complexity: O(nlogn) due to the sorting.
# Space: O(1) if sorting doesn't use extra space.
# The intuition here is to sort and then select the min of the pairs which will always the be the odd elements as they are sorted.

class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        res = 0
        for i in range(0, len(nums), 2):
            res += nums[i]
        return res

    # Here the time is O(n) as we use bucket sort. Basically determining the min and max value and iterating over it. Consider a flag to switch between
    # even and odd positions. And then if the freq is even divide by two and multiply the value. If its odd then divide by 2 * i plus one extra addition
    def arrayPairSumUsingBucket(self, nums: List[int]) -> int:
        minVal = min(nums)
        maxVal = max(nums)
        hashmap = {}
        for num in nums:
            if num in hashmap:
                hashmap[num] += 1
            else:
                hashmap[num] = 1
        result = 0
        flag = True
        for i in range(minVal, maxVal + 1):
            if i not in hashmap: continue
            if not flag:
                hashmap[i] -= 1
                flag = True
            fr = hashmap[i]
            if fr % 2 == 0:
                result += (fr // 2) * i
                flag = True
            else:
                result += (fr // 2) * i
                result += i
                flag = False
        return result
