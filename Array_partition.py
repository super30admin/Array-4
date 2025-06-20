
#TC: O(nlogn)
#SC: O(1)
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort(reverse = True)
        output = 0
        for i in range(0,len(nums),2):
            output += nums[i+1]

        return output
        

#TC: O(n)
#SC: O(n)
#Bucket Sort solution
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        count_map = {}
        mini = float("inf")
        maxi = float("-inf")
        for i in nums:
            if i not in count_map:
                count_map[i]=1
            else:
                count_map[i]+=1
            mini = min(mini,i)
            maxi = max(maxi,i)
        
        output = 0
        carry_over = False
        for i in range(mini,maxi+1):
            if i in count_map:
                if carry_over:
                    count_map[i]=count_map[i]-1
                output+=(count_map[i]//2)*i
                if count_map[i]%2 != 0:
                    carry_over = True
                    output+=i
                else:
                    carry_over = False
            
            i = i+1
        return output



        