//Time Complexity = O(nlogn).
//Space Complexity = O(1)
class Solution {
public:
    int arrayPairSum(vector<int>& nums) {
        std::sort(nums.begin(),nums.end());
        int sum = 0;
        for(int i=0; i<nums.size(); i+=2){
            sum+=nums.at(i);
        }
        return sum;
    }
};