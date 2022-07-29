#TC: O(n)
#SC: O(1)
class Solution(object):
    def nextPermutation(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        pvoit=-1
        def swap(nums,l,r):
            nums[l],nums[r]=nums[r],nums[l]
            
        def reverse(nums,l,r):
            while(l<r):
                swap(nums,l,r)
                l+=1
                r-=1
        for i in range(len(nums)-2,-1,-1):
            if nums[i]<nums[i+1]:
                pvoit=i
                break
        print(pvoit)
        if pvoit==-1:
            reverse(nums,0,len(nums)-1)
            return
        for i in range(len(nums)-1,-1,-1):
            if nums[i]>nums[pvoit]:
                swap(nums,i,pvoit)
                print(nums)
                reverse(nums,pvoit+1,len(nums)-1)
                break