class Solution {
    public int solve(int[] values, int i, int j,int[][] dp){
        if(j-i<2) return 0;


        if(dp[i][j]!=-1) return dp[i][j];
        int minVal=Integer.MAX_VALUE;

        for(int k=i+1;k<j;k++){
            int curr=values[i]*values[k]*values[j];

            int left=solve(values,i,k,dp);
            int right=solve(values,k,j,dp);

            int total= curr+left+right;

            minVal=Math.min(total,minVal);
        }
        return dp[i][j]= minVal;
    }
    public int minScoreTriangulation(int[] values) {
        int n= values.length;
        int[][] dp= new int[n][n];

        for(int[] d:dp){
            Arrays.fill(d,-1);
        }
        return solve(values,0,n-1,dp);
    }
}