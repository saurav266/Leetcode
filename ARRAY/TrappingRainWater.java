class Solution {
    public int trap(int[] h) {
        int n= h.length;
        int[] left= new int[n];

        int[] right= new int[n];

        // left
        left[0]=0;
        int maxLen=h[0];

        for(int i=1;i<n;i++){
            left[i]=maxLen;
            maxLen=Math.max(h[i],maxLen);
        }

        left[n-1]=0;
        maxLen=h[n-1];

        for(int i=n-2;i>=0;i--){
            right[i]=maxLen;
            maxLen=Math.max(maxLen,h[i]);
        }

        /// int total=0;

        int total=0;

        for(int i=0;i<n;i++){
            int sum=Math.min(left[i],right[i])-h[i];
            if(sum>0) total+=sum;
        }
        return total;
    }
}