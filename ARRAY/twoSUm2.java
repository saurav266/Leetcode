class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int[] ans={-1,-1};
        int i=0;
        int j=n-1;
        while(i<j){
            int sum=numbers[i]+numbers[j];
            if(sum==target){
                ans[0]=i+1;
                ans[1]=j+1;
                break;
            }
            else if(sum>target){
                j--;
            }
            else{
                i++;
            }
        }
        return ans;
    }
}