# Time Complexity :
# O(N)

# Space Complexity :
# O(1) - There is no auxillary space being allocated

# Did this code successfully run on Leetcode :
#Yes

#We process the numbers from the end. We find the first position where the number is smaller than the previous number, we stop there and store in curr loc
#Then we find the number to replace this found location in the same end to curr_loc, - an element that is just bigger than the number at current location
#After this, we reverse the end to curr_loc  (this will ensure smallest number is present for the last part of the number)

class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        prev = nums[-1]
        processed = []
        processed.append(prev)
        breach_found = False
        i = len(nums) - 2
        while (i >= 0 ):
            if nums[i] < nums[i+1]:
                breach_found = True
                break
            i -= 1

        j = len(nums) - 1
        while (j > i):
            if nums[j] > nums[i] :
                break
            j -= 1

        if breach_found == False:
            nums.reverse()
        else :
            temp = nums[j]
            nums[j] = nums[i]
            nums[i] = temp
            nums[i+1:] = nums[i+1:][::-1]

        
