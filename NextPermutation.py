#TC: O(n)
#SC:O(1)
#Intuition: Start from the end, find the point where the value dips, swap it with the next higher number
# finally reverse after the swapping point k

class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        def reverse(start, end, nums):
            while(start<end):
                nums[start], nums[end] = nums[end], nums[start]
                start +=1
                end -=1
        k = -1
        for i in range(len(nums)-1,0,-1):
            if nums[i]>nums[i-1]:
                k = i-1
                break

        if k !=-1:
            for i in range(len(nums)-1,k,-1):
                if nums[k]<nums[i]:
                    nums[k], nums[i] = nums[i], nums[k]
                    break
            
        reverse(k+1, len(nums)-1, nums)
