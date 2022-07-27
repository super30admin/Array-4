# Approach: For finding next lexiographical permutation that is greater
# we can traverse right to left looking for first number that is smaller than
# the number before it. And then do another pass to find next larger number
# compared the current small number and swap them
# Then reverse the array after that point.
# TC: 
# SC:
class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        E.g. 
        input = [1,2,3,9,8,7,6]
                     ^ ^ <-- breach
        breach = [1,2,6,9,8,7,3]
                      ^       ^ <-- swap
        output= [1,2,6,3,7,8,9]
                       ^-----^ <-- reverse
        E.g.2: 
        input = [1,3,2]
                 ^ <-- breach
        breach = [2,3,1]
                  ^   ^ <-- swap
        output = [2,1,3]
        E.g.3: 
        input = [2,3,1]
                 ^ <-- breach
        breach = [3,2,1]
                  ^   ^ <-- swap
        output = [3,1,2]
        """
        if len(nums)<=1: return
        # find breach
        breach = -1
        for i in range(len(nums)-2, -1, -1):
            if nums[i+1] > nums[i]:
                # set breach index
                breach = i
                break
        # meaning we didn't find breach
        if breach < 0:
            # reverse the array and return
            self.reverse(nums, 0, len(nums)-1)
            return
        # swap breach with next biggest element
        # go from right to left, to index before the breach, try to find
        # element that's next bigger than breach element
        for i in range(len(nums)-1, breach, -1):
            # swap the elements
            if nums[i] > nums[breach]:
                # find first element that is greater than nums[breach]
                # swap them
                nums[i], nums[breach] = nums[breach], nums[i]
                break
        # reverse rest of the array
        self.reverse(nums, breach+1, len(nums)-1)
        
    def reverse(self, nums, l, h):
        while l < h:
            nums[l], nums[h] = nums[h], nums[l]
            l += 1
            h -= 1
