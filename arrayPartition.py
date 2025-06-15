# Time Complexity : O(n log n)
# Space Complexity : O(1)
# Approach: Sort the array and then take the sum of every second element.
class Solution:
    def arrayPairSum(self, nums):
        n = len(nums)
        nums.sort()
        res = 0

        for i in range(0, n, 2):
            res += nums[i]

        return res

# Time Complexity : O(max(nums) - min(nums))
# Space Complexity : O(n)
# # Approach: Use a hashmap to count the occurrences of each number.
# If the count is even, add half of the count times the number to the result.
# If the count is odd, add half of the count times the number plus the number itself to the result.
# If the count is odd, we alternate adding the number to the result. 
class Solution:
    def arrayPairSum(self, nums):
        n = len(nums)
        hashMap = {}
        mn, mx = float('inf'), float('-inf')
        res = 0
        flag = True
        for i in range(n):
            hashMap[nums[i]] = 1 + hashMap.get(nums[i], 0)
            mn = min(mn, nums[i])
            mx = max(mx, nums[i])

        for i in range(mn, mx+1):
            if i not in hashMap: continue
            if not flag:
                hashMap[i] -= 1
                flag = True
            if hashMap[i] > 0 and hashMap[i] % 2 == 0:
                res += (hashMap[i]//2) * i
                flag = True
            elif hashMap[i] > 0:
                
                res += (hashMap[i]//2)*i + i
                flag = False

        return res