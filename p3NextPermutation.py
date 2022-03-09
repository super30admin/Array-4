class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        time O(N)
        space O(1)
        """
        l = len(nums)
        if l == 0: return
        for i in range(l-1, -1, -1):
            if nums[i-1] <nums[i] :
                break
        if i == 0: #reached the end and all numbers are descending, so reverse to ascend
            nums[0:] = nums[0:][::-1]
        i -=1
        

        comp = nums[i]
        for nu in range(l-1,-1,-1):
            if  nums[nu] >comp:
                nums[nu], nums[i] = nums[i], nums[nu]
                break

        nums[i+1:] = nums[i+1:][::-1]