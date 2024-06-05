//Time O(n)
//Space O(1)
//Letcode : yes
//issue seen : none
class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int n = nums.size();
        int sum = nums[0];
        int maxSum = nums[0];
        int start =0;
        int end=0;

        for(int i=1; i<n; i++){
            if(sum+nums[i] > nums[i]){
                sum = sum + nums[i];
                if(sum > maxSum) {
                 end = i;
                }
                
            } else {
                sum = nums[i];
                start = i;
                end = i;
            }
            maxSum = max(maxSum, sum);
        }
        cout<< start << '\n';
        cout << end << '\n';
        return maxSum;
        
    }
};
