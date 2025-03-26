/*
TC : O(n)
SC : O(1)
*/
class Solution
{
public:
    int maxSubArray(vector<int> &nums)
    {
        if (nums.size() == 0 || nums.empty())
        {
            return 0;
        }

        int rSum = 0;
        int max = nums[0];
        int start = 0;

        for (int i = 0; i < nums.size(); i++)
        {
            if (rSum + nums[i] > nums[i])
            {
                rSum = rSum + nums[i];
            }
            else
            {
                rSum = nums[i];
                start = i;
            }

            if (rSum > max)
            {
                max = rSum;
            }
        }

        return max;
    }
};