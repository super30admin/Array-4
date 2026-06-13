class Solution:
    def nextPermutation(self, nums):
        n = len(nums)
        point = -1
        for i in range(n - 1, 0, -1):
            if nums[i - 1] < nums[i]:
                point = i - 1
                break
        if point == -1:
            nums.reverse()
            return

        for i in range(n - 1, point, -1):
            if nums[i] > nums[point]:
                nums[i], nums[point] = nums[point], nums[i]
                break

        left = point + 1
        right = n - 1
        while left < right:
            nums[left], nums[right] = nums[right], nums[left]
            left += 1
            right -= 1
