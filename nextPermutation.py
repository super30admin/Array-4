def nextPermutation(self, nums: List[int]) -> None:
    """
    Do not return anything, modify nums in-place instead.
    """
    if not nums:
        return

    n = len(nums)
    curr = n - 2
    while curr >= 0 and nums[curr + 1] <= nums[curr]:
        curr -= 1
    if curr >= 0:
        prev = n - 1
        while nums[prev] <= nums[curr]:
            prev -= 1
        nums[prev], nums[curr] = nums[curr], nums[prev]

    self.reverse(curr + 1, n - 1, nums)


def reverse(self, i, j, nums):
    while i < j:
        nums[i], nums[j] = nums[j], nums[i]
        # print(nums)
        i += 1
        j -= 1