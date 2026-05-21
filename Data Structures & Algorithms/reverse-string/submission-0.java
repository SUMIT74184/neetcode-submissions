class Solution {
    public void reverseString(char[] s) {
        Stack<Character> st = new Stack<>();
        for(char c:s){
            st.push(c);
        }
        int i = 0;
        while(!st.isEmpty()){
            System.out.println("Before the iteration : "+i);
            s[i++]=st.pop();
             System.out.println("After the iteration : "+i);
        }
    }
}