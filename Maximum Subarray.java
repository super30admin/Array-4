/*


class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        if nums is None or len(nums) == 0:
            return 0
        
        max_sum = nums[0]
        cur_sum = nums[0]
        start = 0
        end = 0
        curStart = 0
        
        for i in range(1, len(nums)):
            if nums[i] > cur_sum + nums[i]:
                cur_sum = nums[i]
                curStart = i
            else:
                cur_sum = cur_sum + nums[i]
            
            if cur_sum > max_sum:
                max_sum = cur_sum
                start = curStart
                end = i
        print(start, end)
        return max_sum

# if we want all the start and end of pairs which are equal for eg [-2,-2,-2]        
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        if nums is None or len(nums) == 0:
            return 0
        
        max_sum = nums[0]
        cur_sum = nums[0]
        start = 0
        end = 0
        curStart = 0
        ans_list = []
        ans_list.append((start, end))
        for i in range(1, len(nums)):
            if nums[i] > cur_sum + nums[i]:
                cur_sum = nums[i]
                curStart = i
            else:
                cur_sum = cur_sum + nums[i]
            
            if cur_sum > max_sum:
                ans_list = []
                max_sum = cur_sum
                start = curStart
                end = i
                ans_list.append((start, end))
                
            elif cur_sum == max_sum:
                max_sum = cur_sum
                start = curStart
                end = i
                ans_list.append((start, end))
        print(ans_list)
        return max_sum
*/        

// Time - O(n)
// Space - O(1)
// Logic - maintained a running sum and check whether adding another next number was greater than the number itself and then checked with 
// max value
class Solution {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        
        int rmax = nums[0], max = nums[0];
        int start = 0, end = 0, curStart = 0;
        for (int i=1; i<nums.length; i++){
            if (nums[i] > rmax + nums[i]){
                rmax = nums[i];
                curStart = i;
            }
            else{
                rmax = rmax + nums[i];
            }
            
            if (rmax > max){                        // done this to get actual array
                max = rmax;
                start = curStart;
                end = i;
            }
        }
        System.out.println(start+" "+end);
        return max;
    }
}