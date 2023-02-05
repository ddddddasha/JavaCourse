package Lesson5;

public class Matrix {
    private static final  String[][] matrix = new String[10][10];
    public void printMatrix(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <10; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("-------------------------------------------------------------------------------");
    }
    public String[][] getMatrix() {
        return matrix;
    }
}
