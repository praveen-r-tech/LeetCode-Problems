class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ans=new ArrayList<>();
        int[] minls=new int[matrix.length];
        int[] maxls=new int[matrix[0].length];
        for(int i=0; i<matrix.length; i++){
            int min=Integer.MAX_VALUE;
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]<min) min=matrix[i][j];
            }
            minls[i]=min;
        }
        for(int j=0; j<matrix[0].length; j++){
            int max=0;
            for(int i=0; i<matrix.length; i++){
                if(matrix[i][j]>max) max=matrix[i][j];
            }
            maxls[j]=max;
        }
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(minls[i]==maxls[j]) ans.add(matrix[i][j]);
            }
        }
        return ans;
    }
}
