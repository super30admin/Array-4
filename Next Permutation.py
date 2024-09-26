class Solution:
    def swap1(self,nums,l,r):
        temp=nums[l]
        nums[l]=nums[r]
        nums[r]=temp
    def nextPermutation(self, nums: List[int]) -> None:
        if nums==None or len(nums)==0:return
        n=len(nums)
        i=n-2
        while(i>=0 and nums[i]>=nums[i+1]):
            i-=1
        j=n-1
        if i>=0:
            while(j>=0 and nums[j]<=nums[i]):
                j-=1
            self.swap1(nums,i,j)
        self.reverse(nums,i+1,n-1)

    def reverse(self,nums,l,r):
        while l<=r:
            self.swap1(nums,l,r)
            l+=1
            r-=1
        