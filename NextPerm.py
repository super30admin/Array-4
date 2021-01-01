class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        # STEP ONE IS TO FIND THE BREACH
        
        breach = len(nums)-2
        
        while breach>=0 and nums[breach+1]<=nums[breach]:
            breach-=1
        
        #WE NEED THE NUMBER JUST GREATER THAN THE BREACH POINT, THIS CAN START FROM 0
        #CAUSE THE BREACH IMPLIES INCREASING ORDER
    
                
        if breach!=-1:
            #we find the next bigger element
            nextBigger = len(nums)-1
            while nums[nextBigger]<=nums[breach]:
                nextBigger-=1
            self.swap(nums, breach, nextBigger)
        self.reverse(nums, breach+1, len(nums)-1)
        
    
        
 
    def swap(self, nums, breach, swapIndex):
        nums[breach], nums[swapIndex] = nums[swapIndex], nums[breach]

    def reverse(self, nums, left, right):
        while left<right:
            nums[left], nums[right] = nums[right], nums[left]
            left+=1
            right-=1
        return nums
        

#Time: O(n)
#Space: O(1)
                
        
        
