# TC - O(n)
# SC - O(1)

class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if nums is None or len(nums) == 0: return 0

        n = len(nums)
        index = -1

        # step 1: check for breach or check if an element on left is smaller than element
        # on right.
        for i in range(n - 2, 0, -1):
            if nums[i] < nums[i + 1]:
                # note the index
                index = i
                break
        # print(index)
        # step 2: find element from the right which is just greater than the element
        # found in step 1
        if index != -1:
            for i in range(n - 1, index, -1):
                if nums[i] > nums[index]:
                    # swap
                    nums[i], nums[index] = nums[index], nums[i]
                    break

        # step 3: reverse the part from index+1 till the end
        nums[index + 1:n] = nums[index + 1:n][::-1]