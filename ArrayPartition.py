from typing import List
# class Solution:
#     def arrayPairSum(self, nums: List[int]) -> int:
#         nums.sort()
#         res = 0
#         for i in range(0,len(nums),2):
#             res+=nums[i]
#         return res

# class Solution:
#     def arrayPairSum(self, nums: List[int]) -> int:
#         hm , res= {}, 0
#         maxval,minval = float("-inf"), float("inf")
#         for i in range(len(nums)):
#             hm[nums[i]] = hm.get(nums[i],0)+1
#             maxval = max(maxval, nums[i])
#             minval = min(minval,nums[i])
#         flag = True #skip when false
#         for i in range(minval, maxval+1):
#             while hm.get(i,0) >0 :
#                 if flag:
#                     res+=i
#                 flag = not flag
#                 hm[i]-=1
#                 if hm[i] == 0:
#                     # hm.pop(i)
#                     del hm[i]
#         return res

class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        hm , res= {}, 0
        maxval,minval = float("-inf"), float("inf")
        for i in range(len(nums)):
            hm[nums[i]] = hm.get(nums[i],0)+1
            maxval = max(maxval, nums[i])
            minval = min(minval,nums[i])
        flag = False #add when false
        for i in range(minval, maxval+1):
            if i not in hm: continue
            if flag:
                hm[i] = hm.get(i)-1
                flag = False
            fr = hm.get(i)
            if fr%2 == 0:
                res+=(fr//2)*i
                flag = False
            else:
                res+=(fr//2)*i
                res+=i
                flag = True
        return res
                



        

                



        


        