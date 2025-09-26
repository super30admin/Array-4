
//Time Complexity: O(n)
//Space Complexity: O(1)

//The question is to find the next lexicographical permutation of a given array of numbers.

//The approach involves three main steps:
//1. Identify the rightmost "breach" where the current element is less than the next element. 
// This indicates where the next permutation can be formed.
//2. If no breach is found, it means the array is in descending order, and we simply sort it to get the smallest permutation.
//3. If a breach is found, we find the smallest element to the right of the breach that is larger 
// than the breach element, swap them, and then reverse the elements to the right of the breach to get the next permutation.


class Solution {
    public void nextPermutation(int[] a) {
        int idx=-1,n=a.length;
        for(int i=n-2;i>=0;i--){   //finding the breach 7563542 (at 3)
            if(a[i]<a[i+1]){
                idx=i;
                break;
            }
        }
        //if no breah 
        if(idx==-1){
            Arrays.sort(a);
            return;
        }
        //idendity the  just bigger ele of the breach ele(i.e 4) and swap
        for(int i=n-1;i>idx;i--){
            if(a[i]>a[idx]){
                int t=a[i];
                a[i]=a[idx];
                a[idx]=t;
                break;
            }
        }
        reverse(a,idx+1);
    }
    void reverse(int a[],int x){
        int i=x,j=a.length-1;
        while(i<j){
            int t=a[i];
            a[i]=a[j];
            a[j]=t;
            i++;
            j--;
        }
    }
}