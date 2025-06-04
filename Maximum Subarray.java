class Solution {
    public int maxSubArray(int[] nums) {
        int result=nums[0];
        int tot=0;
        for (int n:nums){
            if(tot<0){
                tot=0;
            }
            tot+=n;
            result=Math.max(tot,result);
        }
        return result;
    }
}
