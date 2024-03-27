//Time: O(n)
//Space: O(n)

//Greedy: Sort, pick minimum two elements each time so that the effect of minimization (we need to take minimum value of that pair) is reduced
class Solution {
public:
    int arrayPairSum(vector<int>& v) {
        sort(v.begin(), v.end());

        int sum = 0;
        for(int i=0;i<v.size()-1;i+=2){
            sum += min(v[i],v[i+1]);
        }
        return sum;
    }
};
