class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """

        # Time Complexity: O(n)
        # Spcae Complexity: O(1)
        def swap(i, j):

            nums[i], nums[j] = nums[j], nums[i]
            return

        def reverse(i):
            j = len(nums) - 1
            while i < j:
                swap(i, j)
                j -= 1
                i += 1

        for i in range(len(nums) - 2, -1, -1):
            if nums[i] < nums[i + 1]:
                for j in range(len(nums) - 1, i, -1):
                    if nums[j] > nums[i]:
                        swap(i, j)
                        reverse(i + 1)
                        # print("inside")
                        return
        # print("outside")
        reverse(0)
        return


