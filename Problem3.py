"""
31. Next Permutation
Time Complexity - O(n)
Space Complexity - O(1)
First we need to find first element less than peak value i.e. peak_index
Then from right side find the number peak_elem_index that is first number higher than peak_index value
Then swap those elements and reverse elements after peak_index"""
class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if nums == None or len(nums) == 0:
            return
        peak_index = -1
        peak_elem_index = -1
        n = len(nums)

        for i in range(n-2,-1,-1):
            if nums[i] < nums[i+1]:
                peak_index = i
                break
        if peak_index != -1:
            for i in range(n-1,-1,-1):
                if nums[i] > nums[peak_index]:
                    peak_elem_index = i
                    self.swap(nums,peak_index,peak_elem_index)
                    break
        self.reverse(nums,peak_index+1,n)
                
    def swap(self,nums,index1,index2):
        nums[index1] , nums[index2] = nums[index2] , nums[index1]
    
    def reverse(self,nums,start,end):
        end -= 1
        while(start < end):
            self.swap(nums,start,end)
            start +=1
            end -= 1