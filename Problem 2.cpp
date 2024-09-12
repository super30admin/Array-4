//Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No
class Solution {
public:
    //find indices of the max array
    int maxSubArray(vector<int>& nums) {
        int max_sum=nums[0];
        int sum = nums[0];
        int st =-1; int end =-1;
        int temp = -1;
        for(int i=1; i<nums.size(); i++){
            if(nums[i]>(sum+nums[i])){
                temp = i;
                sum=nums[i];
            }
            else{
                sum = sum+nums[i];
            }
            
            if(sum>max_sum){
                st = temp;
                end = i;
                max_sum = sum;
            }
        }
        
        cout << st << endl;
        cout << end << endl;
        
        return max_sum;
    }
};