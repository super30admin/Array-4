class Solution(object):
    def nextPermutation(self, nums): #T.C -> O(N) + O(1) + O(R)
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        i = n - 2
        while i>=0 and nums[i] >= nums[i+1]:
            i -=1
        
        if i>=0:
            j = n - 1
            while nums[i] >= nums[j]:
                j-=1
            nums[i],nums[j] = nums[j],nums[i]
        self.rev(nums,i+1,n-1)
    
    def rev(self,nums,i,j):
        while i < j:
            nums[i],nums[j] = nums[j],nums[i]
            i+=1
            j-=1
        
    

