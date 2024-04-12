// t-c: n
// s-c: 1
class Solution {
public:
    void nextPermutation(vector<int>& nums) {
        int diff = INT_MAX;
        int i, j, idx = -1;
        for(i = nums.size()-1; i > 0; i--){
            if(nums[i] > nums[i-1]){
                for(j = nums.size()-1; j > (i-1); j--){
                    if(nums[j] > nums[i-1] && abs(nums[j] - nums[i-1]) <= diff){
                        if(idx == -1 || nums[j] > nums[idx]){
                            diff = nums[i-1] - nums[j];
                            idx = j;
                        }
                    }
                }
                break;
            }
        }
        if(i-1 >= 0)
            swap(nums[i-1],nums[idx]);
        j = nums.size()-1;
        while(i < j){
            swap(nums[i], nums[j]);
            i++;
            j--;
        }
    }
};
