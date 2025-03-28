class Solution {
    public String removeTrailingZeros(String num) {
       StringBuilder ans= new StringBuilder(num);
       for(int i= num.length()-1; i>=0; i--){
        if(ans.charAt(i)=='0'){
            ans.deleteCharAt(i);
        }else{
            break;
        }
       } 
       return ans.toString();
    }
}
