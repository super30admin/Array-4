# TC: O(N LOG N)
# SC: O(1)

class Solution:
    def reverse(self,nums,i,j):
        while i<j:
            nums[i],nums[j]=nums[j],nums[i]
            i+=1
            j-=1

    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        k=-1
        for i in range(len(nums)-1,-1,-1):
            if i>0 and nums[i]>nums[i-1]:
                k=i-1
                break
        print(k)
        if k==-1:
            return self.reverse(nums,0,len(nums)-1)

        for i in range(len(nums)-1,-1,-1):
            if nums[i]>nums[k]:
                nums[i],nums[k]=nums[k],nums[i]
                break
        
        nums[k+1:] = sorted(nums[k+1:])
        # print(nums[k+1:])

        return nums
