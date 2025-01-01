class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.

        3i 654
        4 65 3
        4 356
        """
        if not nums:
            return []
        
        flag = True

        for i in range(len(nums)-2, -1, -1):
            if nums[i] >= nums[i+1]: continue


            for j in range(len(nums)-1, i, -1):
                if nums[i] < nums[j]:
                    nums[i], nums[j] = nums[j], nums[i]
                    #reverse
                    # nums[i+1:] = nums[i+1::-1]
                    flag = False
                    break
            # nums[i+1:] = sorted(nums[i+1:])
            nums[i + 1:] = reversed(nums[i + 1:])
            break
        
        if flag:
            nums.sort()
