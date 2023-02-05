package Lesson5;

import java.util.Arrays;

public class Diagonals {
    private String[] mainDiagonal = new String[10];
    private String[] sideDiagonal = new String[10];
    private String[] twoDiagonals = new String[mainDiagonal.length + sideDiagonal.length];
    private static final double CHECK_DOUBLE = 1.7;
    private int countString = 0;
    public void compareDiagonals(String[][] matrix){
        for (int i = 0; i<10; i++){
            for (int j = 0; j < 10; j++) {
                if (i == j) {
                    mainDiagonal[i] = matrix[i][j];
                }
                if ((i + j + 1) == 10) {
                    sideDiagonal[i] = matrix[i][j];
                }
            }
        }
        printDiagonals(mainDiagonal, sideDiagonal);
        if (Arrays.equals(mainDiagonal, sideDiagonal)) {
            System.out.println("Диагонали равны");
        }
        else {
            System.out.println("Диагонали разные");
        }
    }
    public void printDiagonals(String[] mainDiagonal, String[] sideDiagonal){
        System.out.println("Главная диагональ:");
        for (String s : mainDiagonal) {
            System.out.print(s + " ");
        }
        System.out.println("\nПобочная диагональ:");
        for (String s : sideDiagonal) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
    public void concatDiagonals(String[] twoDiagonals){
        System.arraycopy(mainDiagonal, 0, twoDiagonals, 0, mainDiagonal.length);
        System.arraycopy(sideDiagonal, 0, twoDiagonals, mainDiagonal.length, sideDiagonal.length);

        System.out.println("Объединенные диагонали:");
        for (String s : twoDiagonals) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
    public void checkStringOrDouble(){
        StringBuilder stringBuilder = new StringBuilder();
        for (String item:twoDiagonals) {
            if(!isNumeric(item)) {
                stringBuilder.insert(stringBuilder.length(), item, 1, 4);
                stringBuilder.append(", ");
                countString++;
            }
        }
        System.out.println(stringBuilder.substring(0,stringBuilder.length()-2));
        double[] arrayDouble = new double[twoDiagonals.length - countString];
        int countDouble = 0;
        for (String item: twoDiagonals) {
            if(isNumeric(item) && Double.parseDouble(item)>= CHECK_DOUBLE){ //если число > 1.7
                arrayDouble[countDouble] = Math.ceil(Double.parseDouble(item));
                countDouble++;
            }
            else if (isNumeric(item) && Double.parseDouble(item)< CHECK_DOUBLE) {
                arrayDouble[countDouble] = Math.floor(Double.parseDouble(item));
                countDouble++;
            }
        }
        for (double item : arrayDouble ) {
            System.out.print(item + "_");
        }
    }
    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }
    public String[] getTwoDiagonals() {
        return twoDiagonals;
    }
}
