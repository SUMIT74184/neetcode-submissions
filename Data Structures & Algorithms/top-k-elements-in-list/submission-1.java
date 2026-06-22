class Solution {
    // sorting technique using the Hashmaps
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>count = new HashMap<>();
        for(int num: nums){
            count.put(num,count.getOrDefault(num,0)+1);
        }
        //Enter the element in hashmap with count <int,int>

        List<int[]> arr = new ArrayList<>();
        for(Map.Entry<Integer,Integer>entry: count.entrySet()){
            arr.add(new int[]{entry.getValue(),entry.getKey()});
        }
        // traverse the key value pair together in singel iteration
        // entry.getKey() gives you the original number (e.g., 5)
        // entry.getValue() gives you how many times it appeared (e.g., 3)

        arr.sort((a,b) -> b[0]-a[0]); //sort it down
        int [] res = new int[k];
        for(int i = 0; i< k; i++){
            res[i] = arr.get(i)[1];
        }
        return res;
    }
}
