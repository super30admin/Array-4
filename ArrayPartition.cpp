

class Solution {
public:
    int arrayPairSum(vector<int>& nums) {
        unordered_map<int,int> map;
        int min = INT_MAX;
        int max= INT_MIN;
        int result = 0;

        for(int i = 0; i<nums.size();i++)
        {
            map.insert(nums[i],map.getOrDefault(nums[i],0)+1);
            min = min(min,nums[i]);
            max = max(max,nums[i]);
        }

        bool flag = false;
        for(int i = min;i<=max; i++)
        {
            if(map.contains(i))
            {
                if(flag)
                {
                  map.insert(i,map.get(i)-1);  
                }
                int cnt = map.get(i);
                result+= cnt/2 *i;
                if(cnt%2 == 0)
                {
                    flag = false;
                }else
                {
                    result+=i;
                    flag = true;
                }
            }
        }
        return result;
    }
};