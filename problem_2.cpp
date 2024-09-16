//Time Complexity = O(N)
//Space Complexity = O(1)
class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int max = nums.at(0);
        for(int i=1; i<nums.size(); i++){
            nums.at(i) = std::max(nums.at(i),nums.at(i) + nums.at(i-1));
            max = std::max(max,nums.at(i));
        }
        return max;
    }
};