# Time:- O(n)
# Space:- O(1)
# Approach:- In one scan of the numbers we find out where and if there is a violation, the
# next permutation is not possible if the nums are all in a descending order, if we find the 
# last ascending position we then just reverse the second part to get the next permutation
class Solution(object):
    def nextPermutation(self,nums):
        i = j = len(nums)-1
        while i > 0 and nums[i-1] >= nums[i]:
            i -= 1
        if i == 0:   # nums are in descending order
            nums.reverse()
            return 
        k = i - 1    # find the last "ascending" position
        while nums[j] <= nums[k]:
            j -= 1
        nums[k], nums[j] = nums[j], nums[k]  
        l, r = k+1, len(nums)-1  # reverse the second part
        while l < r:
            nums[l], nums[r] = nums[r], nums[l]
            l +=1 ; r -= 1