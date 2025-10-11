class Solution {
    public void rotate(int[][] matrix) {
        int n= matrix.length;

        // transpose

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                // swap
                int temp= matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        // rotate

        for(int k=0;k<n;k++){
            int i=0;
            int j=n-1;
            while(i<j){
                // swap
                int temp= matrix[k][i];
                matrix[k][i]=matrix[k][j];
                matrix[k][j]=temp;
                i++;
                j--;
            }
        }
      
    }
}