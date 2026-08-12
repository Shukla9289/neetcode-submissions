class Solution {
    public int lengthOfLongestSubstring(String s) {
        int low =0;
        int maxlen=0;
        HashMap<Character,Integer>mp= new HashMap<>();
        for(int high=0;high<s.length();high++){
            char ch = s.charAt(high);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
            while(mp.get(ch)>1){
                char chlow= s.charAt(low);
                mp.put(chlow,mp.getOrDefault(chlow,0)-1);
                if(mp.get(chlow)==0){
                    mp.remove(chlow);
                }
                low++;
            }
            int windowsize=high-low+1;
            maxlen=Math.max(maxlen,windowsize);
        }
        return maxlen;
    }
}
