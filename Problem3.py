'''
Problem: Next Permutation
Time Complexity: O(n), n is array length
Space Complexity: O(1)
Did this code successfully run on Leetcode: Yes
Any problem you faced while coding this: No
Your code here along with comments explaining your approach:
        find the breach from the end
        find the next best element to replace with breach which is just big
        and then reverse the rest of array  
'''

class Solution:
    def reverse(self, nums, i , j):
        while i <=j:
            self.swap(nums, i, j)
            i+=1
            j-=1
    
    def swap(self, nums, i , j):
        temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp


    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """

        #find breach
        i = len(nums)-2

        while i >=0:
            if nums[i]<nums[i+1]:
                break
            i-=1

        if i==-1:
            self.reverse(nums, 0, len(nums)-1)
        else:
            #replace with next big element
            j = len(nums)-1
            while j >=i:
                if nums[j]>nums[i]:
                    self.swap(nums,i, j )
                    break
                j-=1
            
            print(nums)

            self.reverse(nums, i+1, len(nums)-1)