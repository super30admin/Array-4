# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

#Approach and Intuition:
# Brute Force: Backtracking to get all combinations (TC:O(n!)) and then choose the next permutation.
# 1. Make the graph for a few example permutations! eg: 2476531->2513467->2513476
# 2. Observations from the graph representation: 
# -->for every new permutation, we see a new peak being added/changed so every time we try to find a new peak when we calculate a new permutation
# --> We start from right side and reach the peak. The next point/indessx from right after the peak is our new peak! We need to start from the right as we need the immediate next permutation. Eg: 12345, 12354 makes sense. 
# Hence step 1: find peak index
# Step 2: Find next highest element of peak index in the array from right hand side till the peak element (keep comparing the elements from right with peak element)
# Step 3: Swap that element with our next peak element found in step 2
# Step 4: Reverse the array from peak index+1

class Solution:
    
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if nums == None or len(nums)==0:
            return
        
        peak_index = len(nums) - 2 
        while peak_index>= 0 and nums[peak_index]>= nums[peak_index+1]:
            peak_index -=1
        
        if peak_index>=0:
            peak_elem = len(nums)-1
            while peak_elem >= 0 and nums[peak_elem]<= nums[peak_index]:
                peak_elem-=1
                
            self.swap(nums, peak_index, peak_elem)
            
        self.reversed(nums, peak_index+1, len(nums)-1)
        
    def reversed(self, nums, start, end):
        while start<end:
            self.swap(nums, start, end)
            start += 1
            end -=1
    
    def swap(self, nums, i, j):
        temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp
        
            


