# Appoach 1:
# Time Complexity: O(n logn)
# Space Complexity: O(1)
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:

        nums.sort() #O(n log n)
        sum = 0
        for i in range(0,len(nums),2): #O(n/2)
            sum += nums[i]
        return sum

# -------------------------------------------------------------- 
# Appoach 2:
# Time Complexity: O(n + m)
# Space Complexity: O(n)

class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        hashmap = {}
        min_val = float('inf')
        max_val = float('-inf')
        for val in nums:        # O(n)
            min_val = min(val,min_val)
            max_val = max(val, max_val)
            if val not in hashmap:
                hashmap[val] = 1
            else:
                hashmap[val] += 1
        result = 0
        flag =  False
        for i in range(min_val, max_val + 1):  # O(m)  m is the range between the minimum and maximum values observed in the input list. 
            if i in hashmap:
                if flag is True:
                    hashmap[i] -= 1
                pairs = hashmap[i] // 2
                result += pairs * i
                if (hashmap[i])%2 == 0:
                    flag = False
                else:
                    flag = True
                    result += i
        return result