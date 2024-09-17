class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
            
        if(len(nums)==0):
            return
        i=len(nums)-2
        while i>=0 and nums[i+1]<=nums[i]:
            i-=1
        if(i>=0):
            j=len(nums)-1
            while (j>=0 and nums[j]<=nums[i]):
                j-=1; 
            nums[i],nums[j] = nums[j],nums[i]
        self.reverse(nums,i+1,len(nums)-1)
    def reverse(self, nums, i, j):
        while(i<j):
            nums[i],nums[j] = nums[j],nums[i]
            i+=1
            j-=1

#time complexity - O(n)

#space complexity - O(1)

#all test cases passd