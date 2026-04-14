# problem 1 


# https://leetcode.com/problems/array-partition/description/

class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        result = 0 
        min_val = float('inf')
        max_val = float('-inf')
        h_map = {}
        for num in nums:
            min_val = min(min_val,num)
            max_val = max(max_val,num)
            h_map[num] = h_map.get(num,0)+1

        flag = False 
        for i in range(min_val,max_val+1):
            if i not in h_map:
                continue 
            if flag:
                h_map[i]-=1 
            if h_map[i] % 2 == 0:
                total_occ = (h_map[i] // 2) * i 
                result += total_occ
                flag = False
            else:
                total_occ = (h_map[i] // 2) * i
                total_occ += i
                result += total_occ
                flag = True 

        return result
