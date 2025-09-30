class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n= nums.length;
        int[] ans={-1,-1};

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                }
            }
        }
        return ans;
    }
}


// second solution
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n= nums.length;
        int[] ans={-1,-1};
        Map<Integer,Integer> mp= new HashMap<>();
        for(int i=0;i<n;i++){
           int rem=target-nums[i];
           if(mp.containsKey(rem)){
              int j= mp.get(rem);
              ans[0]=i;
              ans[1]=j;
              break;
           }
           else{
            mp.put(nums[i],i);
           }
        }
        return ans;
    }
}