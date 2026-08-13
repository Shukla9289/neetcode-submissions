class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer>mp=new HashMap<>();
        int max=Integer.MIN_VALUE;
        int maxfreq=0;
        int i=0;
        int j=0;
        while(j<s.length()){
            mp.put(s.charAt(j),mp.getOrDefault(s.charAt(j),0)+1);
            maxfreq=Math.max(mp.get(s.charAt(j)),maxfreq);
            while(j-i+1-maxfreq>k){
                mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)-1);
                i++;
            }
            max=Math.max(j-i+1,max);
            j++;
        }
        return max;
    }
}
