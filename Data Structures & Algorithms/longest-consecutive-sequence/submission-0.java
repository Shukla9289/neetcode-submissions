class Solution {
    public int longestConsecutive(int[] nums) {
         int longest=0;
         HashSet<Integer>set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        for(int num:set){        
        if(!set.contains(num-1)){
            int currelement=num;
            int count =1;

            while(set.contains(currelement+1)){
                currelement++;
                count++;
            }
        
            longest=Math.max(longest,count);
        }
        }
        return longest;
    }
}
