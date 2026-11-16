# PROBLEM 561. ARRAY PARTITION
# TIME COMPELXITY: O(N) where N is the length of array
# SPACE COMPLEXITY: O(N) in order to create a map
# We have another method which is by sorting that take Time Complexity of O(N log N) and Space Complexity O(1)


class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        max_num=float('-inf')
        min_num=float('inf')
        mapFreq={}
        result=0

        for i in range(len(nums)):
            mapFreq[nums[i]]=mapFreq.get(nums[i],0)+1
            max_num=max(max_num,nums[i])
            min_num=min(min_num,nums[i])

        flag=False

        for i in range(min_num,max_num+1):
            if i not in mapFreq:
                continue
            
            if flag:
                mapFreq[i]-=1
            
            freq=mapFreq[i]
            if freq%2==0:
                result+=(freq//2)*i
                flag=False
            else:
                result+=(freq//2)*i
                result+=i
                flag=True
        
        return result