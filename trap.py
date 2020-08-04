#42. Trapping Rain Water
# Time Complexity : O(n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
class Solution:
    def trap(self, height: List[int]) -> int:
        n = len(height)
        l,r = 0 , n-1
        lw,rw = 0,0
        result = 0
        while l <= r:
            if lw <= rw: #process left side
                if lw > height[l]:
                    result += lw - height[l]
                else:
                    lw = height[l]
                l += 1
            else:
                if rw > height[r]:
                    result += rw - height[r]
                else:
                    rw = height[r]
                r -= 1
        return result