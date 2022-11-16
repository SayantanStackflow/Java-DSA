class Matrixprogram{
        int[][]calculate(int[][]a, int [][]b){
            int row1= a.length;
            int row2= b.length;
            int col1= a[0].length;
            int col2= b[0].length;
            int[][]ans= new int[row1][col2];
            for(int i=0; i<row1; i++){
                for(int j=0; j<col2; j++){
                    ans[i][j]= 0;
                    for(int k=0; k<col1; k++){
                        ans[i][j]+= a[i][k]* b[k][j];
                    }
                }
            }
            return ans;
        }
        void printMatrix(int[][]matx){
            for(int i=0; i<matx.length; i++){
                for(int j=0; j<matx[i].length; j++){
                    System.out.print(matx[i][j]+" ");
                }
                System.out.println();
            }
        }
}
class Matrix{
    public static void main(String[] args) {
        
        int[][]matx1= new int[][]
        {
            {3,5,9,3},
            {7,2,8,5},
            {1,4,6,7}
        };
        int[][]matx2=new int[][]
        {
            {9,7},
            {5,1},
            {2,6},
            {3,4}
        };
        Matrixprogram obj= new Matrixprogram();
        int ans[][]= obj.calculate(matx1, matx2);
        System.out.println("The first matrix is: ");
        obj.printMatrix(matx1);
        System.out.println("The second matrix is: ");
        obj.printMatrix(matx2);
        System.out.println("The product of the matrics are: ");
        obj.printMatrix(ans);
    }
}