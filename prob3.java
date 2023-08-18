// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

class Solution {
    public void nextPermutation(int[] n) {
        //breakpoint
       if(  n==null || n.length<=1)return;
		
		int i = n.length-2;

		while(i>=0 && n[i]>=n[i+1])i--;
		
		int j=n.length-1;
		
		if(i>=0) {
			while(n[j]<=n[i])j--;
			swap(n,i,j);
		}
		
		reverse(n,i+1,n.length-1);
		
		for(int p=0;p<n.length;p++) {
			System.out.println(n[p]);
		}
		
	}
	public static void swap(int n[],int i,int j) {
		int temp=n[i];
		n[i]=n[j];
		n[j]=temp;
	}
	public static void reverse(int n[],int i,int j) {
		while(i<j) {
			swap(n,i,j);
			i++;
			j--;
		}
	}
}