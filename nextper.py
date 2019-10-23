"""
Leetcode - running
Time complexity - O(N)
space complexity - O(1)
explaination in comments
"""
def nextPermutation(self, nums):
        i = j = len(nums)-1
        while i > 0 and nums[i-1] >= nums[i]:
            i-= 1 # find the first least element from backwards
        if i == 0:
            nums.reverse() # if no such found just reverse the entire list as per the instructions
            return 
        first_min = i - 1
        while nums[j] <= nums[first_min]: # now find the next element near to the least min element 
                                            # by traversing again from backward.
            j -= 1
        nums[first_min],nums[j] = nums[j],nums[first_min] # swap the two elements
        left,right = first_min +1 , len(nums)-1 # now reverse the sub list from where the two elements                                                    # were swapped
        while left<right:
            nums[left] ,nums[right] = nums[right], nums[left]
            left += 1
            right -= 1