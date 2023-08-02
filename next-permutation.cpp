// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

#include <vector>
#include <algorithm>
using namespace std;

class Solution {
public:
    void nextPermutation(std::vector<int>& nums) {
        int n = nums.size();

        if (n == 0) {
            return;
        }

        int i = n - 2;
        while (i >= 0 && nums[i + 1] <= nums[i]) {
            i--;
        }

        if (i >= 0) {
            int j = n - 1;
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }

            std::swap(nums[i], nums[j]);
        }

        reverse(nums.begin() + i + 1, nums.end());
    }

private:
    void reverse(std::vector<int>::iterator start, std::vector<int>::iterator end) {
        while (start < end) {
            std::swap(*start, *end);
            start++;
            end--;
        }
    }
};
