class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int s : stones){
            minHeap.offer(-s);
        }

        while(minHeap.size() > 1){
            int first = minHeap.poll();
            int second = minHeap.poll();
            if(second > first){
                minHeap.offer(first - second);
            }
        }
        // if nothing is present just return 0
        minHeap.offer(0);
        return Math.abs(minHeap.peek());
    }
}
