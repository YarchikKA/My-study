import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class task_14 {
    static public void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("numbers.txt"));
        int rows = in.nextInt();
        int cols = in.nextInt();
        int minSum = Integer.MAX_VALUE;
        int korR = 0;
        int korC = 0;
        int[][] mat = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = in.nextInt();
            }
        }
        in.close();
        for (int i = 0; i < rows - 1; i++) {
            for (int j = 0; j < cols - 1; j++) {
                if (minSum > mat[i][j] + mat[i][j + 1] + mat[i + 1][j] + mat[i + 1][j + 1]) {
                    minSum = mat[i][j] + mat[i][j + 1] + mat[i + 1][j] + mat[i + 1][j + 1];
                    korR = i;
                    korC = j;
                }
            }
        }
        System.out.println("Minimum sum " + minSum + " found at [" + korR + "," + korC + "]:");
        System.out.println(mat[korR][korC] + " " + mat[korR][korC + 1]);
        System.out.println(mat[korR + 1][korC] + " " + mat[korR + 1][korC + 1]);

    }
}
