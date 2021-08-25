class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if len(nums)==0:
            return []
        if len(nums)==1:
            return nums
        
        #1) first find minimum, smallest number where breach happened
        #2)smallest number greater than breached number then swap
        #3) next swap the elements after breach, reverse them
        def swapelement(nums,left,right):
            while(left<right):
                nums[left],nums[right]=nums[right],nums[left]
                left+=1
                right-=1
        breachindex=-1
        for i in range(len(nums)-2,-1,-1):
            if nums[i]<nums[i+1]:
                breachindex=i
                break
            
        if breachindex>=0:
            j=len(nums)-1
            while(j>breachindex):
                
                if nums[j]>nums[breachindex]:
                    nums[breachindex],nums[j]=nums[j],nums[breachindex]
                    break
                j-=1
        
                    
        swapelement(nums,breachindex+1,len(nums)-1)
        #Time O(n)
        #space O(1)
            
