// Last updated: 7/9/2026, 10:07:23 AM
class Solution {
    public boolean searchMatrix(int[][] arr, int x) {
        int i=0,j=arr[0].length-1;
	    while(i<arr.length && j>=0){
	        if(arr[i][j]==x) return true;
	        if(arr[i][j]<x && i<arr.length) i++;
	        else j--;
	    }
		return false;
    }
}