class Solution {
    public String reorganizeString(String s) {
        StringBuilder res = new StringBuilder();
        int[] freq = new int[26];

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        for (int i = 0; i < 26; i++) {
            if(freq[i] > 0){
            maxHeap.offer(new int[] {freq[i], i});
        }
        }
        int[] prev = null; 
        while (!maxHeap.isEmpty() || prev != null) {
            if (maxHeap.isEmpty() && prev != null) {
                return "";
            }
            int[] curr = maxHeap.poll();
            res.append((char) (curr[1] + 'a'));
            curr[0]--;
         
            // now after some while we will look at it
            if (prev != null) {
                maxHeap.offer(prev);
                prev = null;
            }
            // we will not store the use character again
               if (curr[0] > 0) {
                prev = curr;
            }
        }
        return res.toString();
    }
}