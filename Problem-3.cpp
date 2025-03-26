class Solution
{
public:
    void nextPermutation(vector<int> &nums)
    {
        if (nums.size() == 0 || nums.empty())
        {
            return;
        }

        int i = nums.size() - 2;

        // iterate till element is smaller than the next element
        while (i >= 0 && nums[i] >= nums[i + 1])
        {
            i--;
        }

        // swap if there exists an element greater than the next
        if (i != -1)
        {
            int j = nums.size() - 1;
            while (j > i && nums[i] >= nums[j])
            {
                j--;
            }
            swap(nums, i, j);
        }
        for (auto i : nums)
        {
            cout << i << endl;
        }

        // reverse the elements starting from the smallest element found
        // till the end of the list
        reverse(nums, i + 1);
    }

    void swap(vector<int> &nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    void reverse(vector<int> &nums, int i)
    {
        if (i < nums.size())
        {
            int j = nums.size() - 1;
            while (i < j)
            {
                swap(nums, i, j);
                i++;
                j--;
            }
        }
        else
        {
            return;
        }
    }
};