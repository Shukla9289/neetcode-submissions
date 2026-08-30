class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int ans[] = new int [n];
        int i=0;
        int j = n-1;
        int idx = n-1;
        while(i<=j){
            int isquare = nums[i]*nums[i];
            int jsquare = nums[j]*nums[j];
            if(isquare<jsquare){
                ans[idx]=jsquare;
                j--;
            }
            else{
                ans[idx]=isquare;
                i++;
            }
            idx--;
        }
    return ans;
    }
}