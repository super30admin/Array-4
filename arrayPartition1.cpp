//time complexity:O(nlogn)
//space complexity:O(1)
//executed on leetcode: yes
//approach:using sorting and selecting alternate numbers
//any issues faced? no

class Solution {
public:
    int arrayPairSum(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        int sum=0;
        for(int i=0; i<nums.size()-1; i+=2)
        {
            sum+=nums[i];
        }
        return sum;
    }
};

