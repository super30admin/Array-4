# 31. Next Permutation
class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        n = len(nums)
        j = n-1
        k = n-1

        def reverse(arr,i,j):
            while i < j:
                arr[i],arr[j] = arr[j], arr[i]
                i += 1
                j -= 1
        
        def swap(arr,i,j):
            arr[i], arr[j] = arr[j], arr[i]

        while j>=0 and nums[j-1] >= nums[j]: j -= 1
        j -= 1

        print(j)
        
        if j < 0: reverse(nums,0,len(nums)-1)
        else:
            while k >= 0 and nums[k] <= nums[j]:
                k -= 1

            swap(nums,j,k)
            reverse(nums,j+1,n-1)


        