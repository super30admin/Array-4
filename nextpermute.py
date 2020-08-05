# brute force solution.
# find all the permutations of a number.
# sort the permutations and find the next permutation of the number.
# time complexity - O(n^2)
# space complexity - O(n^n)
# Did this code run on leetcode? - no (TLE)
class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        self.permutations = set()
        
        # find all permutations of a number
        self.rec(nums, "", len(nums))
        
        self.permutations = list(self.permutations)
        np = len(self.permutations) # number of permutations of a number
        
        self.permutations.sort()   # sorted list of permutations
        
        num_str = ""
        for n in nums:
            num_str += str(n)
        
        for i in range(np):
            if num_str == self.permutations[i]:
                break
        i+=1
        i%=np
        
        nextpermute = self.permutations[i]
        for i, n in enumerate(nextpermute):
            nums[i] = int(n)
            
        
    # time - O(n^2)
    def rec(self, nums, currn, n):
        if len(nums)==0 and len(currn)==n:
            self.permutations.add(currn)
        else:
            for i in range(len(nums)):
                self.rec(nums[:i]+nums[i+1:], currn+str(nums[i]), n) # cannot convert to int because it will remove trailing zeros of a number.        


# using pointers
# traverse from the end of the number, place the first pointer at the position where num[i] < num[i+1].
# begin from the end and place the second pointer at position where the number is greater than the number at index i.
# example - 126875. next permutation will be 127568 
# ptr1 will be at index 3. (points to 3) 
# ptr2 will be at index 5. (points to 7)
# swap numbers at ptr1 and ptr2. result of this step will be 127865
# reverse the list of numbers from i till the end. result - 127568
# time complexity - O(n)
# space complexity - O(n)
# Did this code run on leetcode? - yes
class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        # if n==0 or n==1: return nums
        
        # find the position where number is less than the number on its right.
        # O(n)
        i = n-2
        while i>=0 and nums[i]>=nums[i+1]:
            i-=1
        
        # O(n)
        j = n-1
        while i>=0 and i<j:
            if nums[i] < nums[j]:
                break
            j-=1
            
        self.swap(nums, i, j)           # swap numbers at position i and j
        self.reverse(nums, i+1, n-1)
    
    # swap numbers at indices i and j
    def swap(self, nums, i, j):
        if i>=0:
            nums[i], nums[j]  = nums[j], nums[i]
        
    # reverse a sublist of numbers
    def reverse(self, nums, i, j):
        while i<j:
            self.swap(nums, i, j)
            i+=1
            j-=1

            