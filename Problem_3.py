from typing import List
class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        if nums == None or len(nums) == 0:
            return 0
        n = len(nums)
        i = n - 2
        while i >= 0 and nums[i] >= nums[i+1]:
            i -= 1
            
        if i >= 0:
            j = n-1
            while nums[i] >= nums[j]:
                j -= 1
            self.swap(nums, i, j)
        self.reverse(nums, i+1, n-1)
        
    def swap(self, nums: List[int], l: int, r: int) -> None:
        temp = nums[l]
        nums[l] = nums[r]
        nums[r] = temp
    
    def reverse(self, nums: List[int], l: int, r: int) -> None:
        while l < r:
            self.swap(nums, l, r)
            l += 1
            r -= 1

obj = Solution()
print(obj.nextPermutation([1,2,3]))

# Time Complexity: O(n)
# Space Complexity: O(1)