class Solution {
    public int[] getOrder(int[][] tasks) {
        PriorityQueue<int[]> avail = new PriorityQueue<>((a,b)->
        a[0] == b[0] ? Integer.compare(a[1], b[1]): Integer.compare(a[0],b[0])
        );
        PriorityQueue<int[]> pending = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
// pending is sortend by enqueue(arriving time)
        int n = tasks.length;
        for(int i = 0;i < n; i++){
            pending.offer(new int[]{tasks[i][0],tasks[i][1],i});

        }

        long time = 0;
        int idx = 0;
        int[] res = new int[n];
       while (!pending.isEmpty() || !avail.isEmpty()) {
         while (!pending.isEmpty() && pending.peek()[0]<= time) {
            int [] task = pending.poll();
            avail.offer(new int[]{task[1],task[2]}); //hame sirf processing time aur index se matlab hain
       }
       if(avail.isEmpty()){
        time = pending.peek()[0];
        continue; // time increment hota rahega jabtak enqueue time mein nahi aate 
        //utna time idle rahega cpu and time++
       }
       int[]task = avail.poll();
       time+= task[0]; //processing time + time iteration
       res[idx++] = task[1];

       }
       return res;
    }
}