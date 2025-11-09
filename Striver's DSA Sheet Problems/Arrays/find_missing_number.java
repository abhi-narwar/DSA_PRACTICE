class find_missing_number{
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=(n*(n+1)/2);
        int num_sum=0;
        for (int i=0;i<n;i++){
            num_sum=num_sum+nums[i];
        }
        int ans=sum-num_sum;
        return ans;

        
    }

}