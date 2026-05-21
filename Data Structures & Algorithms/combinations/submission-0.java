class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer>cur = new ArrayList<>();
        comb(1,n,k,cur,res);
        return res;
    }

    public void comb(int i,int n,int k,List<Integer>cur,List<List<Integer>> res){
        if(i>n){
            if(cur.size()==k){
                res.add(new ArrayList<>(cur));
                
            }
            return;
        }
        cur.add(i);
        comb(i+1,n,k,cur,res);

        cur.remove(cur.size()-1);
        comb(i+1,n,k,cur,res);
    }
}