class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        lastIdx=len(nums)-1
        swapIdx=-1
        st=[lastIdx]
        for idx in range(len(nums)-2, -1, -1):
            if nums[idx]<nums[idx+1]:
                swapIdx=idx
                break
            else:
                st.append(idx)
        
        if swapIdx==-1:
            nums.sort()
        
        else:
            while st and nums[swapIdx]<nums[st[-1]]:
                lastIdx=st.pop()
            nums[lastIdx], nums[swapIdx]= nums[swapIdx], nums[lastIdx]
            l=swapIdx+1
            r=len(nums)-1

            while l<=r:
                nums[l], nums[r]=nums[r], nums[l]
                l+=1
                r-=1
            
        