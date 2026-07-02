class Solution {
    public int lastStoneWeight(int[] stones) {
        // PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        // we are using the maxheap remember 
        PriorityQueue<Integer> maxheap =
                new PriorityQueue<>(Collections.reverseOrder());
        for(int s : stones){
            maxheap.offer(s);
        }

        while(maxheap.size() > 1){
            int first = maxheap.poll();
            int second = maxheap.poll();
            if(second != first){
                maxheap.offer(first - second);
            }
        }
        // if nothing is present just return 0
        maxheap.offer(0);
        return Math.abs(maxheap.peek());
    }
}
