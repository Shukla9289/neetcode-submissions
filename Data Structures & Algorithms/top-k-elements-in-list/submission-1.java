class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<int[]>pq = new PriorityQueue<>((a,b)->{
            if(a[0]==b[0]){
                return a[1]-b[1];
            }
            return a[0]-b[0];
        });
        HashMap<Integer,Integer>map= new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            int key=entry.getKey();
            int value=entry.getValue();
            pq.add(new int[]{value,key});
            if(pq.size()>k){
                pq.poll();
            }
        }
        int[]ans=new int[k];
        int i=0;
        while(!pq.isEmpty()){
            ans[i]=pq.poll()[1];
            i++;
        }
        return ans;
    }
}
