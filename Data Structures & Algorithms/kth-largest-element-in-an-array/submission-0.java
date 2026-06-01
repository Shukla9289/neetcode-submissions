class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->a-b);
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
            if(pq.size()>k){
                pq.poll();
            }
        }
        if(!pq.isEmpty()){
            return pq.poll();
        }
        return 0;
    }
}
