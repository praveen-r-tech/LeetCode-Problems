class Solution {
    public boolean judgeCircle(String moves) {
      int x= 0;
      int y= 0;
      for(char ch: moves.toCharArray()){
         if(ch== 'U') y++;
         else if(ch== 'D') y--;
         else if(ch== 'R') x++;
         else x--;
      }
      return x== 0 && y== 0;
    }
}
