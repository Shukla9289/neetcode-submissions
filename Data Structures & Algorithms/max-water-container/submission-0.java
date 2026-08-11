class Solution {
    public int maxArea(int[] heights) {
      int n=heights.length;
      int maxwater=0;
      int i=0;
      int j=n-1;
      while(i<j){
        int w=j-i;
        int h = Math.min(heights[i],heights[j]);
        int area= w*h;
        maxwater=Math.max(maxwater,area);
        if(heights[i]<heights[j]){
            i++;
        }
        else{
            j--;
        }
      }
      return maxwater;
    }
}
