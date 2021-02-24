#time: O(n)
#space: O(1)

class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        start=0
        end=len(nums)-2
        while(end>=0):
            if(nums[end]<nums[end+1]):
                break
            end-=1
        
        if(end>=0):
            j=len(nums)-1
            while(j>end):
                if(nums[j]>nums[end]):
                    nums[j],nums[end]=nums[end],nums[j]
                    print(nums)
                    self.reverse(end+1,nums)
                    break
                j-=1
        else:
            self.reverse(0,nums)
            
    def reverse(self,start,nums):
        end=len(nums)-1
        while(start<end):
            nums[start],nums[end]=nums[end],nums[start]
            end-=1
            start+=1
        
        