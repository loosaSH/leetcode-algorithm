package leetcode;

/**
 * leetcode 867
 * Created by solie_h on 2018/10/12.
 */
public class TransposeMatrix {

    public static int[][] transpose(int[][] A) {

        int a = A.length;
        if(a<=0){
            return A;
        }
        int b = A[0].length;

        int[][] matrix = new int[b][a];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                matrix[j][i] = A[i][j];
            }
        }


        return matrix;
    }


    public static void main(String[] args) {
        int[][] A = {{1, 2, 3}, {4, 5, 6}};
        int[][] B = transpose(A);
        System.out.println(B);
    }

}
