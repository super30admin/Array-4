//Time Complexity O(n)
// Space Complexity O(n)
//Problem successfully executed on leetcode
//No problems faced while coading this.


#include<iostream>
#include<vector>
#include<queue>
#include<map>
#include<stack>
using namespace std;

class Solution {
public:
    void nextPermutation(vector<int>& nums) {
        int len=nums.size();
        int index=-1;
        for(int i=len-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                index=i;
                break;
            }
        }
        if(index!=-1)
        {
           for(int i=len-1;i>index;i--)
            {
                if(nums[i]>nums[index])
                {
                    swap(nums,i,index);
                    break;
                }
            } 
        }
        reverse(nums,index+1,len-1);
    }
    
    void reverse(vector<int> & nums,int i,int j)
    {
        while(i<j)
        {
            swap(nums,i,j);
            i++;
            j--;
        }
    }
    void swap(vector<int> &nums,int i,int j)
    {
        int temp=nums[j];
        nums[j]=nums[i];
        nums[i]=temp;
    }
};