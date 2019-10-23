# Time Complexity: O(n)
# Space Complexity: O(1)
# Approach: First find the non increasing element on reverse iteration of the array. 
#			If all the elements are increasing , just flip the array.
#			Else, find the min value just greater that the dipping value from the increasing values sub array
#			Swap the dipping and this minimum value. Now reverse the increasing values.
# Took help from class for this problem.
class Solution:
    def flip(self, nums, inc_index):
        start = inc_index
        end  = len(nums) -1
        while start < end:
            nums[start], nums[end] = nums[end], nums[start]
            start += 1
            end -= 1
            
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        inc_index = len(nums) - 1
        
        for i in range(len(nums)-2, -1,-1):
            if nums[inc_index] <= nums[i]:
                inc_index = i
            else:
                break
        
        if inc_index == 0:
            self.flip(nums, inc_index)
        else:
            local_min = inc_index
            for i in range(inc_index+1,len(nums)):
                if nums[local_min] >= nums[i]  and nums[i] > nums[inc_index-1]:
                    local_min = i
            nums[local_min], nums[inc_index-1] = nums[inc_index-1], nums[local_min]
            self.flip(nums, inc_index)
                
                
            
                

                