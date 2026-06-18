class Solution {
    public int leastInterval(char[] tasks, int n) {
        //first count the frequencies
        int []count = new int[26];
        for(char task : tasks){
            count[task - 'A']++;
        }

        //adding the frequencies count inside the maxHeap
        PriorityQueue<Integer>maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int cnt : count){
            if(cnt > 0){
                maxHeap.add(cnt);
            }
        }

        int time = 0;
        Queue<int[]> q = new LinkedList<>(); //creating the queue
        while(!maxHeap.isEmpty() || !q.isEmpty()){
            time++; //yaha se time increment ho raha hain har baar phele

            if(maxHeap.isEmpty()){
                time = q.peek()[1];
            }else{
                int cnt = maxHeap.poll()-1;
                if(cnt>0){
                    q.add(new int[]{cnt, time  + n});
                }
            }

// time ka jaise jaise aage jaa raha hain hum
            if (!q.isEmpty() && q.peek()[1] == time){
                maxHeap.add(q.poll()[0]);
            }
        }
        return time;
    }
}
