class Solution {
    public String modifyString(String s) {
       char[] str=s.toCharArray();
       int n=str.length;
       for(int i=0; i<n; i++){
         if(str[i]=='?'){
            char left=(i>=1)? str[i-1]:'-';
            char right=(i<n-1)? str[i+1]:'-';
            if(left!='a' && right!='a') str[i]='a';
            else if(left!='b' && right!='b') str[i]='b';
            else if(left!='c' && right!='c') str[i]='c';
            else if(left!='d' && right!='d') str[i]='d';
            else str[i]='e';
         }
       }
       return new String(str);
    }
}
