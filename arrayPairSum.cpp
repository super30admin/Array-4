// Time Complexity : O(n log n) <- Due to sorting. 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

// Three line explanation of solution in plain english
/* Sort array and pick alternate elements.
 * Main goal is to avoid discarding all max elements and picking alternate elements helps with this goal.
 */

class Solution {
public:
    int arrayPairSum(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        int sum = 0;
        
        for (int i = 0; i < nums.size(); i += 2)
        {
            sum += nums[i];
        }
        
        return sum;
    }
};