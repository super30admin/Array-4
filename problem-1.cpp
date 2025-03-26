// https://leetcode.com/problems/array-partition/description/

// Time Complexity: O(n long n)
// Space Complexity: O(1)

class Solution {
    public:
        int arrayPairSum(vector<int>& nums) {
            sort(nums.begin(), nums.end());
            int ans=0;
            for(int i=0; i<nums.size(); i+=2){
                ans += nums[i];
            }
            return ans;
        }
    };


// Time Complexity: O(n)
// Space Complexity: O(n)

// using while loop
class Solution {
    public:
        int arrayPairSum(vector<int>& nums) {
            unordered_map<int,int> mp;
            int ans=0;
            int minVal = INT_MAX; int maxVal = INT_MIN;
            for(auto num:nums){
                mp[num]++;
                minVal = min(minVal,num);
                maxVal = max(maxVal, num);
            }
            bool flag = true;
            for(int i=minVal; i<=maxVal; i++){
                while(mp[i] > 0){
                    if(flag) ans += i;
                    mp[i]--;
                    flag = !flag;
                }
            }
            return ans;
        }
    };


// More optimized method

class Solution {
    public:
        int arrayPairSum(vector<int>& nums) {
            unordered_map<int,int> mp;
            int ans=0;
            int minVal = INT_MAX; int maxVal = INT_MIN;
            for(auto num:nums){
                mp[num]++;
                minVal = min(minVal,num);
                maxVal = max(maxVal, num);
            }
            int seen=0;
            for(int i=minVal; i<=maxVal; i++){
                if(mp.find(i) == mp.end()) continue;
                if(seen%2 != 0){
                    mp[i]--;
                    seen += 1;
                }
                int freq = mp[i];
                int cnt=0;
                if(freq%2 == 0){
                    cnt = freq/2;
                }
                else{
                    cnt = freq/2 + 1;
                }
                ans += cnt*i;
                seen += freq;
            }
            return ans;
        }
    };