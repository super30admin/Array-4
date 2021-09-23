/*
TC = O(nlogn)
SC = O(1)
where n is the size of the nums array.
*/
class Solution {
public:
    int arrayPairSum(vector<int>& nums) {
        int i,sum=0;
        sort(nums.begin(),nums.end());
        for(i=0;i<nums.size();i+=2)
        {
            sum+=nums[i];
        }
        return sum;
    }
};
