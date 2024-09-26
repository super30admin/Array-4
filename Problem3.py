# Time Complexity : O(n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Your code here along with comments explaining your approach

class Solution:
    def swap(self, nums, i ,j): 
        if i >= 0 and j >= 0 and i < len(nums) and j < len(nums):
            nums[i], nums[j] = nums[j], nums[i]
    
    def reverse(self, nums, i, j):
        if i >= 0 and j >= 0 and i < len(nums) and j < len(nums):
            while i < j:
                temp = nums[i]
                nums[i] = nums[j]
                nums[j] = temp 
                i += 1 
                j -= 1 
    
    def nextPermutation(self, nums):
        if len(nums) == 0 :
            return nums
        
        m = len(nums)
        # start from second place from back
        i = m - 2 
        # reach the place where you can swap
        while i >= 0 and nums[i+1] <= nums[i]:
            i -= 1 
        
        # if there is a place to swap
        if i >= 0:
            #find the place to swap with and swap
            j = m - 1 
            while nums[j] <= nums[i]:
                j -= 1
            self.swap(nums, i , j)
        # reverse
        self.reverse(nums, i+1, m-1)
        return nums
        

    
if __name__ == "__main__":
    s = Solution()
    nums = [1, 2, 3]
    print(s.nextPermutation(nums))
