class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int left=0;
        int right=n-1;
        int maxwater=0;
        while(left<right){
            int currwater=Math.min(heights[left],heights[right])*(right-left);
            maxwater=Math.max(currwater,maxwater);
            if(heights[left]<heights[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxwater;
    }
}
