class Solution:
    
    # TC: O(N) --> 3N
    # SC: O(1)
    
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        
        opIndex = None
        
        # Step-1: Find the operating index -> The number which is needs to be 
        # swapped in order to find next bigger number
        # TC: O(N)
        for i in range(len(nums) - 2, -1, -1):
            if (nums[i] < nums[i+1]):
                opIndex = i
                break
        
        if (opIndex == None):
            opIndex = -1

                
        # Step-2: Find index of number which is to be swapped by the number at
        # operating index and swap them
        # TC: O(N)
        if (opIndex != -1):
            for i in range(len(nums) - 1, opIndex-1, -1):
                if (nums[i] > nums[opIndex]):
                    # swap
                    nums[i], nums[opIndex] = nums[opIndex], nums[i]
                    break
                
        # Step-3: Reversee the numbers at right of the breach to get smallest 
        # number after that
        # TC: O(N)
        self.reverse(nums, opIndex+1, len(nums)-1)
        
    def reverse(self, arr, start, end):
        
        while(start < end):
            
            arr[start], arr[end] = arr[end], arr[start]
            
            start += 1
            end -= 1
                
        