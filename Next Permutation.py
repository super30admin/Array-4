# time complexity is o(n), where n is the size of the input
# space complexity is o(1)
class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        i = len(nums) - 2
        while(i >= 0 and nums[i] >= nums[i+1]):
            i -= 1
        
        if(i != -1): # reversing if its strictly increasing from end
            j = len(nums) - 1
            while(j >= 0 and nums[j] <= nums[i]):
                j -= 1
            
            #swap numbers
            nums[i], nums[j] = nums[j], nums[i]

        low  = i+1
        high = len(nums)-1
        
        while(low < high):
            nums[low], nums[high] = nums[high], nums[low]
            low +=1 
            high -= 1
        return nums
            
        
        
        
        
        
        
        
        
#         i = len(nums) -1
#         j = i-1
#         end = i 
#         piv = 0
        
#         if(len(nums)==1):
#             return nums
#         if(len(nums)==2):
#             nums[0], nums[1] = nums[1],nums[0]
#             return nums
    
#         while(i > 0):
#             if nums[i] > nums[i-1]:
#                 piv = i
#                 break
#             else:
#                 i -= 1
#                 j -= 1
#         print("i", i)
#         print("j", j)
#         if(i == 0):
#             nums.sort()
#             return nums
#         while(nums[piv-1] >= nums[end] ):
#             end -= 1
#         nums[piv-1], nums[end] = nums[end], nums[piv-1]
        
#         print(nums)
        
#         nums[j+1:] = reversed(nums[j+1:])
#         return nums

    
    

                

        