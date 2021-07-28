class Solution(object):
    def nextPermutation(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        def reverse(nums,i,j):
            while i<j:
                swap(nums,i,j)
                i+=1
                j-=1
            
        def swap(nums,i,j):
            temp = nums[i]
            nums[i] = nums[j]
            nums[j] = temp
        #time:O(n)
        #Space: O(1)
        n = len(nums)
        #find breach where num is not increasing
        i = n - 2
        while i >= 0 and nums[i] >= nums[i+1]:
            i -= 1
            
        #swap with element just above it by going over array in reverse
        if i >= 0:
            k = n-1
            while k > i: 
                if nums[k] > nums[i]:
                    swap(nums,k,i)
                    break
                k -= 1
        #reverse the nums to the right of the position
        reverse(nums,i+1,n-1)
        
