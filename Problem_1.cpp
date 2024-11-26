/**
 * Time complexity:
 * O(NlogN) + O(N/2) where N is the number of 
 * elements in the array. So, it will be O(N)
 */

/**
 * Space Complexity:
 * O(1)
 * 
 */

/**
 * Approach:
 * The intution behind this solution is by sorting the
 * given array we are reducing the distance between two
 * numbers of whom we have to take the minima. For example,
 * 1,4,2,3 will give maximum sum of minimas when we will
 * make pairs 1,2 and 3,4 which if we notice are sorted.
 * 
 * So, we are iterating the array with step size of 2,
 * skipping every larger element of the pairs, and adding
 * it to our result.
 */


class Solution {
public:
    int arrayPairSum(vector<int>& nums) {
        if(nums.empty() || nums.size() == 0) return 0;
        int result = 0;
        sort(nums.begin(), nums.end());
        for(int i =0; i<nums.size(); i = i + 2){
            result += nums[i];
        }
        return result;
        
    }
};