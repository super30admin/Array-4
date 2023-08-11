/*
// Time Complexity : O(nlogn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
Maximize the sum of minimum of set pairs.
Sort them and form adjacent pairs so that you can have higher values in minimum at the end.
*/

#include<iostream>
#include<vector>
#include<unordered_map>

using namespace std;

// sort method

class Solution {
public:
    int arrayPairSum(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        int res{};
        for(int i{};i<nums.size();i = i + 2){
            res+=nums.at(i);
        }
        return res;
    }
};

// count sort method.

//time complexity: O(n)
//space complexity: O(1)

class Solution {
public:
    int arrayPairSum(vector<int>& nums) {
        unordered_map <int,int> umap{};
        int max_val{-10001},min_val{10001};
        for(int i{};i<nums.size();++i){
            if(umap.find(nums.at(i)) == umap.end()){
                umap[nums.at(i)] = 0;
            }
            umap[nums.at(i)]++;
            max_val = max(max_val,nums.at(i));
            min_val = min(min_val,nums.at(i));
        }
        int i{min_val},j{},res{};
        while(i<=max_val){
            if(umap.find(i)!=umap.end()){
                j++;
                if(j%2!=0){
                    res+=i;
                }
                umap[i]--;
                if(umap[i]==0) i++;
            }
            else{
                i++;
            }
        }
        return res;
    }
};