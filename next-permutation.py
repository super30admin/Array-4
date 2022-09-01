"""
Runtime Complexity: O(n) - where 'n' is the number of elements in the list. We traverse the list only once and check for the elements and we swap it instead of generating whole permutation for the given list.
Space Complexity: O(1) - no extra data structure was used to compute the solution.
Yes, the code worked on leetcode.
Issued while coding - No
"""


class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        n = len(nums)
        idx = -1
        for i in range(n-2,-1,-1):
            if nums[i]<nums[i+1]:   #to get the lesser number than the right neighbour to swap
                idx = i
                break
        if idx!=-1:
            for i in range(n-1,-1,-1):
                if nums[i]>nums[idx]:   #find the closest greater element to idx
                    self.swap(nums,idx,i)
                    break
        self.reverse(nums,idx+1,n-1)
        
    def reverse(self,nums,left,right):
        while left<right:
            self.swap(nums,left,right)
            left+=1
            right-=1
    def swap(self,nums,a,b):
        temp = nums[a]
        nums[a] = nums[b]
        nums[b] = temp
                    
                