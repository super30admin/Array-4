# O(n) time
# inner loop is immediately shut down by break 
# O(1) space
class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        arr = nums
        bPoint=-1
        n=len(arr)
        for i in range(n-2,-1,-1):
            # 1. find break point where you walk backward looking for the first number that drops in value compared to the number right next to it
            # any section of an array that is completely descending like 8,6,4,3,1 is already at its max permutation so to make the larger number (next perm) 
            # you need to find where the descending streak breaks
            if arr[i] >= arr[i+1]: continue          
            bPoint = i                                        # Got our breakpoint
            for j in range(n-1,i,-1):   
            # 2. find a number greater than break point      
            # now that break point is located, scan backward from end of array a second time. Look for first number that is strictly larger than
            # your break point and swap those 2 values. Because to get the next lexicographically larger permutation, you want to increase
            # the value at the breakpoint postion by the smallest amount possible (gaurantee smallest possible increase)         
                if arr[j] > arr[bPoint]:                      
                    arr[j], arr[bPoint] = arr[bPoint], arr[j] # Swap it
                    break                                    
            break                                             # Break this loop too
        # 3. reverse after break point to ensure smallest (absolute smallest configuration)
        arr[bPoint+1:] = reversed(arr[bPoint+1:])   
        #  0 1 2 3 4 5 6 7 8
        # [2,1,5,9,4,8,6,5,3,1]
        #          i
        #                j      
        # [2,1,5,9,5 | 8,6,4,3,1]
        # reverse 86431
        # []