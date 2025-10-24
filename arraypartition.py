# Time Complexity : O(N) where N is length of array
# Space Complexity : O(N) as we are using a buckets array of size N+1
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach:
# I am using a hashmap to count the frequency of each number in the array.
# Then I am iterating through the hashmap to find pairs of numbers.
# For each pair, I am adding the minimum of the two numbers to the result.
# Finally, I return the result.

from typing import List
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        hashmap = {}
        miny = min(nums)
        maxy = max(nums)
        result = 0
        flag = False
        print(miny,maxy)
        for num in nums:
            hashmap[num] = hashmap.get(num, 0) + 1
        for i in range(miny,maxy+1):
            if i not in hashmap:
                continue
            if flag:
                hashmap[i] -= 1
            freq = hashmap[i]
            if freq%2 == 0:
                result += (freq//2) * i
                flag = False
            else:
                result += (freq//2) * i
                result += i
                flag = True
        return result