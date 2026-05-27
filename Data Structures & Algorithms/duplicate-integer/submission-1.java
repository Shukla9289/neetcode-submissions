class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        for(int j=1;j<n;j++){
            if(nums[j]==nums[j-1]){
                return true ;
            }
        }
        return false;

    }
}