class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for(int i =0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    nums[i] = -1;
                    nums[j] = -1;
                }
            }
        }

        for(int i=0;i<n;i++){
            if(nums[i] != -1){
                ans = nums[i];
                break;
            }
            else{
                ans = -1;
            }
        }
        return ans;
    }
}