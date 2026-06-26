class Solution {
    public String longestDiverseString(int a, int b, int c) {
       StringBuilder res = new StringBuilder();
       PriorityQueue<int[]> maxHeap = new PriorityQueue<>((x,y) -> y[0] - x[0]);

       if(a > 0) maxHeap.offer(new int[]{a , 'a'});
       if(b > 0) maxHeap.offer(new int[]{b , 'b'});
       if(c > 0) maxHeap.offer(new int[]{c ,'c'});
       
       while(!maxHeap.isEmpty()){
       int[]curr = maxHeap.poll();

       if(res.length() > 1 && res.charAt(res.length() - 1) == curr[1] && 
       res.charAt(res.length() - 2) == curr[1]){
        if(maxHeap.isEmpty()) break;
        int[] prev = maxHeap.poll();
        res.append((char) prev[1]);
        prev[0]--;

        if(prev[0] > 0) maxHeap.offer(prev);
        maxHeap.offer(curr);
       } else{
        res.append((char) curr[1]);
        curr[0]--;
        if(curr[0] > 0) maxHeap.offer(curr);
       }
       }
       return res.toString();
    }
}