class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        """
        TC:O(n)
        SC:O(1)
        """
          
        max_so_far=nums[0]
        ending=nums[0]
        for i in range(1,len(nums)):
            ending=max(ending+nums[i],nums[i] )
            max_so_far=max(max_so_far,ending )
        return max_so_far
            
        
#         """
#         TC:O(n^2)
#         SC:O(1)
#         """
#         n=len(nums)
#         maxx=float('-inf')
#         for i in range(n):
#             summ=0
#             for j in range(i, n):
#                 summ+=nums[j]
#                 maxx=max(maxx, summ)
#         return maxx
                
#         """
#         TC:O(n^3)
#         SC:O(1)
#         """
#         n=len(nums)
#         maxx=float('-inf')
#         for i in range(n-1):
#             for j in range(i, n):
#                 summ=0
#                 for k in range(i,j+1):
#                     summ+=nums[k]
#                 maxx=max(maxx, summ)
#         return maxx
                
                    
                