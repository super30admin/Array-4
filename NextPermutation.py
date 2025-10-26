# Time is O(n) for looping and reversing.
# Space is O(1) as its done is in place

# The intuition is to determine the next highest value which would be the next permutation. So first we try to determine where its kind a breaching
# based on the value looping in reverse, if all are in increasing then it means we are at the end of the permutation and the next permuatation
# would be reverse the entire array.
# Once we determine the breach we swap it with the next highest element again looping in reverse and then reversing from the breach index + 1 to get
# the next permutation
class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        breachIdx = -1
        for i in range(n - 2, -1, -1):
            if nums[i] < nums[i + 1]:
                breachIdx = i
                break
        print(breachIdx)

        if breachIdx == -1:
            # reverse the entire nums array
            self.reverse(nums, 0, n-1)
        else:
            for i in range(n - 1, -1, -1):
                if nums[breachIdx] < nums[i]:
                    nums[breachIdx], nums[i] = nums[i], nums[breachIdx]
                    break
            self.reverse(nums, breachIdx+1, n-1)

    def reverse(self, nums, start, end):
        while start < end:
            nums[start], nums[end] = nums[end], nums[start]
            start += 1
            end -=1