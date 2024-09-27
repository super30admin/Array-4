# // Time Complexity : O(n) -> 3n
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No


# // Your code here along with comments explaining your approach
# 1. find the element that is smaller than next
# 2. find larger int than found and swap
# 3. reverse the remaining

class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if len(nums) == 0 or nums == None: return None
        n = len(nums)
        i = n-2
        breach = 0
        #STEP 1: Find the breach. find the element from right that is smaller than its next
        while i>= 0 and nums[i] >= nums[i+1]:
            i -= 1
       
        #STEP 2: Find the next large element than nums[i] and SWAP
        if i >= 0:
            j = n-1
            while nums[i] >= nums[j]:
                found = j
                j -= 1

            self.swap(nums, i, j)
        # else:
        #     i = -1
        #STEP 3: reverse the array from i+1 to rest
        self.reverse(nums,i+1,n-1)
    
    def reverse(self,arr,l,r):
        while l<r:
            self.swap(arr,l,r)
            l += 1
            r -= 1
            
    def swap(self,arr,l,r):

        temp = arr[l]
        arr[l] = arr[r]
        arr[r] = temp
            
        
        
        
        
        