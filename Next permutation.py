class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        #Time: O(N)
        #Space: O(1)
        if len(nums)>1:
            flag = 0
            def swap(nums,i,j):
                nums[i],nums[j]=nums[j],nums[i]
                return nums
            
            def reverse(nums,i,j):
                while i<j:
                    nums[i],nums[j]=nums[j],nums[i]
                    i+=1
                    j-=1
                return nums
            
            peak = len(nums)-2
            while peak>=0 and nums[peak]>=nums[peak+1]:
                peak-=1
            
            if peak>=0:
                element = len(nums)-1
                while element>=0 and nums[element] <= nums[peak]:
                    element-=1
                swap(nums,peak,element)
            reverse(nums,peak+1,len(nums)-1)
            
            
                
        