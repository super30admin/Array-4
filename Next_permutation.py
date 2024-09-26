// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None
# Time complexity --> o(n)
# space complexity --> o(1)
# 1.start from end and check where the order is decreasing and mark it as first.
# 2.next again start from end and find the number which is closest to the first but not equal to it.
# 3.then sort both first and second.
# 4.Then from the first+1 to the end of the array and place them in an ascending order.
class Solution(object):
    def reverse(self,nums,start,end):
        while start<end:
            nums[start],nums[end]=nums[end],nums[start]
            start=start+1
            end=end-1
    def nextPermutation(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        if nums==None or len(nums)==0:
            return 0
        n=len(nums)-1
        i=n-1
        while i>=0:
            if nums[i]<nums[i+1]:
                break
            i=i-1
        # print(i)
        if i==-1:
            self.reverse(nums,i+1,n)
            return
        j=n
        while j>i:
            if nums[j]>nums[i]:
                break
            j=j-1
        nums[i],nums[j]=nums[j],nums[i]
        self.reverse(nums,i+1,n)
        
            
                
        