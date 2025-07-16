# TimeComplexity:O(nlogn)
# SpaceComplexity:Constant
# Approach: sort the array and take alterantive numbers. we are doing it beacuse if we pair small nums with large nums ,large nums will get wasted


#----------------------
# sort and  take alternative nums
#----------------------
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        ans=0
        for i in range(0,len(nums),2):
            ans+=nums[i]
        return ans



#----------------------
# use bucket sort
#----------------------

class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        #based on range we can use bucket sort insted of merge sort
        d=defaultdict(int)
        mn,mx=float('inf'),float('-inf')
        for num in nums:
            d[num]+=1
            mn=min(mn,num)
            mx=max(mx,num)
        
        ans=0
        flag=True #use the current number
        while(mn<=mx):
           
            if flag:
                if d[mn]>0:
                    ans+=mn
                    d[mn]-=1
                    if d[mn]==0:
                        mn+=1
                flag=False
            else:
                flag=True
                while(mn not in d and mn<=mx):
                    mn+=1
                d[mn]-=1
                if d[mn]==0:
                    mn+=1
                    while(mn not in d and mn<=mx):
                        mn+=1
        return ans


