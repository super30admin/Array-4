//Time O(nlog n)
//Space O(1)
//Leetcode : yes
//Issue seen: none

class Solution {
public:
    int arrayPairSum(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        int sum =0;

        for(int i=0; i< nums.size(); i=i+2){
            sum = sum + nums[i];
        }
        return sum;
    }
};
