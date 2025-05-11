class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int len= image[0].length;
        for(int[] row: image){
            for(int i=0; i<(len+1)/2; i++){
                int tmp= row[i]^1;
                row[i]= row[len-1-i]^1;
                row[len-1-i]= tmp;
            }
        }
        return image;
    }
}
