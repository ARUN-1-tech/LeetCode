// Last updated: 7/9/2026, 10:03:04 AM
class Solution {
    public int[] rowAndMaximumOnes(int[][] arr) {
        int a=0,b=0;
	    for(int i=0;i<arr.length;i++){
		    int c=0;
		    for(int j=0;j<arr[0].length;j++){
		        if(arr[i][j]==1){
		            c++;
		        }
		    }
		    if(a<c){
		        a=c;
		        b=i;
		    }
		}
		return new int[]{b,a};
    }
}