class Solution(object):
    
    """
        
        Name : Shahreen Shahjahan Psyche
        Space : O(1)
        Time : O(NlogN)
        
        Passed All Test Cases : Yes
        
    """
    
    # Using merge sort to sort the array
    def mergeSort(self, nums): 
        if len(nums) >1: 
            mid = len(nums)//2  
            L = nums[0:mid] 
            R = nums[mid:len(nums)] 

            self.mergeSort(L)
            self.mergeSort(R) 

            i = 0
            j = 0
            k = 0

            while i < len(L) and j < len(R): 
                if L[i] < R[j]: 
                    nums[k] = L[i] 
                    i+= 1
                else: 
                    nums[k] = R[j] 
                    j+= 1
                k+= 1

            while i < len(L): 
                nums[k] = L[i] 
                i+= 1
                k+= 1

            while j < len(R): 
                nums[k] = R[j] 
                j+= 1
                k+= 1

    def arrayPairSum(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        
        if not nums:
            return float('-inf')
        
        self.mergeSort(nums)
        summed = 0
        
        for i in range(0, len(nums), 2):
            summed += nums[i]
            
        return summed
        
        

        
