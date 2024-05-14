# Time complexity: O(n)
# Space complexity: O(1)
# Approach: find the number where it is less than its right neighbour and save the index
# get the highest number from right side since we need the smallest element that is greater than value at saved index.
# sort the values from index+1 to n.


class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        
        n = len(nums)
        idx = -1
        # find the number where it is less than its right neighbour
        for i in range(n-2, -1,-1):
            if nums[i] < nums[i+1]:
                idx = i
                break
        # get the highest number from right side of the found index
        if idx != -1:
            for i in range(n-1, -1,-1):
                if nums[i] > nums[idx]:
                    self.swap(nums,idx,i)
                    break
        # reverse the numbers from index+1 to n
        self.reverse(nums,idx+1, n-1)
        
    def reverse(self, nums,left, right):
        while left < right:
            self.swap(nums,left,right)
            left +=1
            right -=1
    def swap(self,nums,a,b):
        temp = nums[a]
        nums[a] = nums[b]
        nums[b] = temp
            
                
        
                
        