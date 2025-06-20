class Solution {
    public boolean isBalanced(String num) {
       int odd= 0, even= 0;
       for(int i=0; i<num.length(); i++){
        int val= num.charAt(i)-'0';
        if(i%2 == 1) odd+=val;
        else even+=val;
       } 
       return odd == even;
    }
}
