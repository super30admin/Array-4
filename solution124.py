#Time Complexity:O(n)
#Space Complexity:O(1)
#Approach:parse through the array from the last element and find a break of ascending growth. At the breach positon swap the number with it next 
#highest number. Reverse the list after the breach position until the last position.
class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if len(nums)==0:
            return
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
            nums[i+1:]=nums[i+1:][::-1]
        else:
            nums.reverse()