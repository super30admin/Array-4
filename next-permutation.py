class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)

        def swap(nums, l, r):
            temp = nums[l]
            nums[l] = nums[r]
            nums[r] = temp
        if n == 2:
            if nums[0] < nums[1]:
                swap(nums, 0, 1)
                return nums
        if nums is None or len(nums) == 0:
            return
        t = -1

        def rev(nums, l, r):
            while l <= r:
                swap(nums, l, r)
                l += 1
                r -= 1

        def swap(nums, l, r):
            temp = nums[l]
            nums[l] = nums[r]
            nums[r] = temp
        for i in range(n-2, -1, -1):
            if nums[i] < nums[i+1]:
                t = i
                break
        if t != -1:
            for i in range(n-1, i > t, -1):
                if nums[i] > nums[t]:
                    # print(i)
                    swap(nums, i, t)
                    break
        rev(nums, t+1, n-1)
