//Time: O(n)
//Space: O(1)

class Solution {
public:
    void nextPermutation(vector<int>& v) {
        int n = v.size();
        int pivot = -1;
        for(int i=n-2;i>=0;i--){
            if(v[i] < v[i+1]){
                pivot = i;
                break;
            }
        }

        //cout<<pivot<<endl;

        if(pivot == -1){ //the current permutation is largest, so the next one is the smallest (wrapped around)
            sort(v.begin(), v.end());
        }
        else{
            for(int i=n-1;i>pivot;i--){
                if(v[i] > v[pivot]){
                    swap(v[i],v[pivot]);
                    //sort(v.begin()+pivot+1,v.end());
                    reverse(v.begin()+pivot+1,v.end()); //instead of sorting, we can reverse the rest of the array, because it's in decreasing order
                    break;
                }
            }
        }
    }
};
