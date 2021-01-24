'''
Time complexity : O(n)
Space Complexity : O(1)

Brute force way is to find all the permutation and get next of the given permitation

step 1: start traversing from end until we get next number less than the curr    
                2 4 7 6 5 3 1
                4 < 7
                4
step 2: swap this one witn the smallest bigger number 
            7 6 5 3 1
            5 > 4 and smallest among all greater numbers
            swap 5 and 4
            2 5 7 6 4 3 1
step 3: reverse the number after this number 
            2 5 7 6 4 3 1
            reverse after 5
            2 5 1 3 4 6 7
            
            '''

class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n  = len(nums)
        if n == 0:
            return 
        
        # step 1
        i = n-2
        while i>=0 and nums[i] >= nums[i+1]: i -= 1
        
        #step 2
        if (i >= 0):
            j = n-1
            while j>=0 and nums[j] <= nums[i]: j -= 1
            nums[i],nums[j] = nums[j],nums[i]
        
        #step 3
        l = i + 1
        r = n-1
        while (l <=r):
            nums[l],nums[r] = nums[r],nums[l]
            l += 1
            r -= 1
        
        return nums