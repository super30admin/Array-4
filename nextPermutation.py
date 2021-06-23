from typing import List

3 steps algorithm:-

# Find the breach
# swap the breach
# reverse the number from breach + 1
class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        breachptr = len(nums) - 2
        right = len(nums) - 1
        while breachptr > 0:
            if nums[breachptr] > nums[right]:
                breachptr -= 1
                right -= 1
            else:
                break
        print(breachptr)
        right = len(nums) -1
        
        while right > breachptr:
            if nums[right] > nums[breachptr]:
                break
            else:
                right -= 1

        print(nums[right])

        temp = nums[right]
        nums[right] = nums[breachptr]
        nums[breachptr] = temp
        print(nums)
        reverse = breachptr +1
        right = len(nums) -1
        while reverse < right:
            temp = nums[right]
            nums[right] = nums[reverse]
            nums[reverse] = temp
            right -= 1
            reverse += 1

        return  nums





if __name__ == '__main__':
    print(Solution().nextPermutation(nums=[1,4,8,6,5,3]))