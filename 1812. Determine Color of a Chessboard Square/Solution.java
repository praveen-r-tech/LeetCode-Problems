class Solution {
    public boolean squareIsWhite(String coordinates) {
      return (coordinates.charAt(0)%2)!=(coordinates.charAt(1)%2);
    }
}
