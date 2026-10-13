class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        List<Integer> ans = new ArrayList<>();

        int topRow = 0;
        int rightCol = n-1;
        int bottomRow = m-1;
        int leftCol = 0;
        int totalElement = 0;

        while(totalElement < m*n){

            //toprow
            for(int j=leftCol;j<=rightCol && totalElement<m*n;j++){
                ans.add(matrix[topRow][j]);
                totalElement++;
                
            }
            topRow++;

            //rightcol
            for(int i=topRow;i<=bottomRow && totalElement<m*n;i++){
                ans.add(matrix[i][rightCol]);
                totalElement++;
                
            }
            rightCol--;

            //bottomrow
            for(int j=rightCol;j>=leftCol && totalElement<m*n;j--){
                ans.add(matrix[bottomRow][j]);
                totalElement++;
                
            }
            bottomRow--;

            //leftcol
            for(int i=bottomRow;i>=topRow && totalElement<m*n;i--){
                ans.add(matrix[i][leftCol]);
                totalElement++;
                
            }
            leftCol++;
        }
    return ans;    
    }
}