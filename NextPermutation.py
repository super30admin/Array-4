class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        """time complexity-O(n)----find breach-O(n), reverse(O(n))---total...asymptomatically O(n)
        space complexity-O(1)
        """
        n=len(nums)-2
        i=len(nums)-2
        while i>=0 and nums[i]>=nums[i+1]:
            i-=1
        if i>=0:
            j=len(nums)-1
            while nums[j]<=nums[i]:
                j-=1
            temp=nums[i]
            nums[i]=nums[j]
            nums[j]=temp
        self.reverse(nums, i+1, len(nums)-1)
        # for i in range(len(nums)-2, -1, -1):
        #     if i>=0 and nums[i]<nums[i+1]:
        #         j=len(nums)-1
        #         while nums[j]<=nums[i]:
        #             j-=1
        #         temp=nums[i]
        #         nums[i]=nums[j]
        #         nums[j]=temp
        #         return self.reverse(nums, i+1, len(nums)-1)
        #     elif i==0 and nums[i]>nums[i+1]:
        #         return self.reverse(nums, 0, len(nums)-1)
        
    def reverse(self, nums, start, end):
        while start<=end:
            nums[start], nums[end]=nums[end], nums[start]
            start+=1
            end-=1
        return nums
                
        