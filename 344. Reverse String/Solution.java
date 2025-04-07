class Solution {
    public void reverseString(char[] s) {
        int lft= 0;
        int rght= s.length-1;
        while(lft<rght){
            char temp= s[lft];
            s[lft]= s[rght];
            s[rght]= temp;
            lft++;
            rght--;
        }
    }
}
