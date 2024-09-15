class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if len(nums) == 0:
            return None

        def swap(nums, i, j):
            nums[i], nums[j] = nums[j], nums[i]

        def reverse(nums, i, l):
            k = 0
            for j in range(i, ((l + i) // 2) + 1):
                temp = nums[j]
                # print(l-k)
                nums[j] = nums[l - k]
                nums[l - k] = temp
                k += 1

        # find the breach
        l = len(nums)
        i = l - 2
        while i >= 0 and nums[i] >= nums[i + 1]:
            i -= 1
        if i >= 0:
            j = l - 1
            while nums[i] >= nums[j]:
                j -= 1
            swap(nums, i, j)
        reverse(nums, i + 1, l - 1)

        # O(n)