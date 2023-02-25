package Lesson5;

public class MatrixWorker {
    private int countElements = 0;
    public void toCreate(String[][] matrix){
        RandomElement element = new RandomElement();
        for(int i=0; i<10; i++){
            for (int j = 0; j < 10; j++) {
                countElements++;
                if(countElements % 3 == 0){
                    matrix[i][j] = element.generateDouble().toString().substring(0,7);
                }
                else {
                    int choice = element.choose();
                    if (choice == 1){
                        matrix[i][j] = element.generateFloat().toString().substring(0,7);
                    }
                    else if (choice == 2) {
                        matrix[i][j] = element.generateString();
                    }
                }
            }
        }
    }
    public void start() {
        Matrix matrix = new Matrix();
        toCreate(matrix.getMatrix());
        matrix.printMatrix();
        Diagonals diagonals = new Diagonals();
        diagonals.compareDiagonals(matrix.getMatrix());
        diagonals.concatDiagonals(diagonals.getTwoDiagonals());
        diagonals.checkStringOrDouble();
    }
}
