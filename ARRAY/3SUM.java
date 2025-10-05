class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n= nums.length;
        Arrays.sort(nums);

        Set<List<Integer>> ans= new HashSet<>();

        for(int i=0;i<n;i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                List<Integer> temp= new ArrayList<>();
                if(sum==0){
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    ans.add(temp);
                    j++;
                }
                else if(sum>0) k--;
                else j++;
            }
        }
        return new ArrayList<>(ans);
    }
}