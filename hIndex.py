#274. H-Index
# Time Complexity : O(n)
# Space Complexity :O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Your code here along with comments explaining your approach
class Solution:
    def hIndex(self, citations: List[int]) -> int:
        n = len(citations)
        res = 0
        temp = [0 for i in range(n+1)]
        for i in range(n):
            temp[min(citations[i],n)] += 1
        for i in range(len(temp)-1,-1,-1):
            res += temp[i]
            if res >= i:
                return i
        return -1