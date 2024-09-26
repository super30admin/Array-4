// Time Complexity : O(n) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

// Three line explanation of solution in plain english
/* Perform following three steps.
 * 1. Locate index i where nums[i] < nums[i+1]
 * 2. Swap ith element with smaller element on right.
 * 3. Reverse the list from first+1 index.
 */

class Solution {
public:
    void nextPermutation(vector<int>& nums) {
        if (nums.size() <= 1)
        {
            return;
        }
        
        int first = -1;
        int n = nums.size();
        
        //1. Locate index i where i < i+1
        
        for (int i = n - 2; i >=0 ; i--)
        {
            if (nums[i] < nums[i + 1])
            {
                first = i;
                break;
            }
        }
        
        //2. Swap ith element with smaller element
        
        if (first != -1)
        {
            for (int i = n - 1; i > first; i--)
            {
                if (nums[i] > nums[first])
                {
                    swap(nums[i], nums[first]);
                    break;
                }
            }
        }
        
        // 3. Reverse the list from first+1 index
        int low = first + 1;
        int high = n - 1;
        while (low < high)
        {
            swap(nums[low], nums[high]);
            low++;
            high--;
        }
    }
};