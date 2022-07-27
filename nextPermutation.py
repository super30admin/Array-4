# O(n)/O(1)
class Solution:
    def swap(self, arr, l ,r):
        arr[l], arr[r] = arr[r], arr[l]
    
    def reverse(self, arr, start, end):
        while start < end:
            self.swap(arr,start,end)
            start += 1
            end -= 1
            
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        idx = len(nums)-2
        
        while idx >= 0 and nums[idx] >= nums[idx+1]:
            idx -= 1
        if idx >= 0:
            j = len(nums) -1
            print(j)
            while nums[idx] >= nums[j] :
                j -= 1
            self.swap(nums, idx, j)
            
        self.reverse(nums,idx+1, len(nums)-1)
