class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        T: O(N)
        S: O(1)
        """
        if not nums: return 0
        
        n = len(nums)
        dip_index = -1
        dip_swap_elem = -1
        
        def swap(i, j):
            nums[i], nums[j] = nums[j], nums[i]
        
        def rev(start, end):
            end -= 1
            while start < end:
                swap(start, end)
                start += 1
                end -= 1
        
        # Find Dip
        for x in range(n-2, -1, -1):
            if nums[x] < nums[x+1]:
                dip_index = x
                break
        
        # Find swap elem
        if dip_index != -1:
            for x in range(n-1, -1, -1):
                if nums[x] > nums[dip_index]:
                    swap_elem_index = x
                    # Swap
                    swap(dip_index, swap_elem_index)
                    break
        # Reverse
        rev(dip_index + 1, n)