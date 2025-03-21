#time:O(n)
#space: O(1)
#apprach, traverse from left to right find the index which is breaking the descending order,
#swap the value at the index with the next biggest element between that index and the last index
#after that reverse the array between i+1 and last 
class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n= len(nums)
        i=n-2
        while i>=0 and nums[i] >= nums[i+1]:
            i-=1
        
        if i>=0:
            j=n-1
            while j>=0 and nums[i] >= nums[j]:
                j-=1
            nums[i],nums[j]=nums[j],nums[i]
        l=i+1
        r=n-1
        while l <r:
            nums[l],nums[r]=nums[r],nums[l]
            l+=1
            r-=1
        return

        




