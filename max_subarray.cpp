// Time Complexity : O(n)
// Space Complexity : O(1)
// Any problem you faced while coding this :
// Retaining previous sum till that point is important
// Your code here along with comments explaining your approach
//1. Create a global sum variable to maintain running sum
//2. Once the running sum is greater than the max sum update the sum and the indexes
//3. Return the max_sum

class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        //edge
        if(nums.size()==NULL)
            return 0;
        
        //logic
        int start=0, end=0;
        int global_sum=nums[0];
        int curr_sum=0;
        int max_sum = nums[0];
        for(int i=1; i<nums.size();i++){
            curr_sum = global_sum + nums[i];
            if(curr_sum < nums[i]){
                global_sum = nums[i];
                if(global_sum > max_sum){
                    max_sum = max(max_sum, global_sum);
                    start=i;
                    end=i;
                }
            }else{
                global_sum = curr_sum;
                if(global_sum > max_sum){
                    max_sum = max(max_sum, global_sum);
                    end = i;
                }
            }
        }
        cout<<start<<" "<<end<<endl;
        return max_sum;
    }
};
