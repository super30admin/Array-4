class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if not nums:
            return
        
        t = -1
        n = len(nums)
        
        #step1 - Find small element on far right
        for i in range(n-2,-1,-1):
            if nums[i]<nums[i+1]:
                t = i
                break
        print(t)
        #swap value at t with next smallest
        if t != -1:
            for i in range(n-1,0,-1):
                if nums[i] > nums[t]:
                    nums[i], nums[t] = nums[t], nums[i]
                    break
            
        #reverse array
        
        nums[t+1:n] = nums[t+1:n][::-1]
        print(nums)
        
        return
            
        
