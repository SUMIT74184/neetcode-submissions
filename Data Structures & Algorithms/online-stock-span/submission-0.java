class StockSpanner {
//Brute force approach
    private List<Integer> arr;

    public StockSpanner() {
        arr = new ArrayList<>();
    }
    
    public int next(int price) {
        arr.add(price); //arr = [100]
        int i = arr.size() - 2;
        // i = arr.size() - 2
        //     = 1 - 2
        //     = -1
        while(i >= 0 && arr.get(i) <= price){
            i--; //move left and check
        }
        return arr.size() - i - 1;
    //     return arr.size() - i - 1
    //    = 1 - (-1) - 1
    //    = 1

    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */