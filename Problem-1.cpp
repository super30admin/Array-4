/*
TC : O(nlogn)
SC : O(1)
*/
class Solution
{
public:
    int arrayPairSum(vector<int> &nums)
    {
        if (nums.size() == 0 || nums.empty())
        {
            return 0;
        }

        sort(nums.begin(), nums.end());
        int total = 0;
        for (int i = 0; i < nums.size(); i = i + 2)
        {
            total = total + nums[i];
        }

        return total;
    }
};