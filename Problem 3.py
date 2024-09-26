# Time: O(n)
# Space: O(1)
class Solution(object):
    def nextPermutation(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        i=len(nums) - 1
        found = False
        pivot = 0
        while i>0:
            if nums[i-1] < nums[i]:
                found = True
                j = i
                mn_val = nums[i]
                mn_index = i
                
                while j<len(nums):
                    if nums[j] > nums[i-1]:
                        if nums[j]<=mn_val:
                            mn_val = nums[j]
                            mn_index = j
                    j += 1
                pivot = i-1
                temp = nums[i-1]
                nums[i-1] = nums[mn_index]
                nums[mn_index] = temp
                break
            i -= 1
                
        if found:
            nums[pivot+1:] = nums[pivot+1:][::-1]
            #print(nums)
        else:
            nums.sort()
        
