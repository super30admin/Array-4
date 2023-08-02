// Time Complexity : O(nlogn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

#include <vector>
#include <algorithm>
  
using namespace std;

class Solution {
public:
    int arrayPairSum(std::vector<int>& nums) {
        std::sort(nums.begin(), nums.end());

        if (nums.size() == 2) {
            return std::min(nums[0], nums[1]);
        }

        if (nums.size() < 2) {
            return 0;
        }

        int sum = 0;

        for (int i = 0; i < nums.size(); i += 2) {
            sum += nums[i];
        }

        return sum;
    }
};
