package entity;


import java.util.Arrays;
import java.util.Random;

public class Matrix {

    private int rows;
    private int columns;
    private double[][] value;

    public Matrix() {
    }

    public void printMatrix() {                         //matrix display
        System.out.println(Arrays.deepToString(getValue()));
    }

    public void fillRandom() {                          //random filling
        value = new double[getRows()][getColumns()];
        for (int i = 0; i < value.length; i++) {
            for (int j = 0; j < value[i].length; j++) {
                Random random = new Random();
                value[i][j] = random.nextInt(100);
            }
        }

    }

    public Matrix multiply(Matrix matrixA, Matrix matrixB) {
        Matrix matrixResult = new Matrix(matrixA.getRows(), matrixB.getColumns());
        matrixResult.fillRandom();
        double[][] matrixResultValue = matrixResult.getValue();
        double[][] matrixAValue = matrixA.getValue();
        double[][] matrixBValue = matrixB.getValue();
        int aRows = matrixA.getRows();
        int aColumns = matrixA.getColumns();
        int bRows = matrixB.getRows();
        int bColumns = matrixB.getColumns();
        for (int i = 0; i < aRows; i++) {
            for (int j = 0; j < bColumns; j++) {
                for (int k = 0; k < aColumns; k++) {
                    matrixResultValue[i][j] += matrixAValue[i][k] * matrixBValue[k][j];
                }

            }
        }

        return matrixResult;
    }

    public Matrix(int rows, int collums) {
        this.rows = rows;
        this.columns = collums;
    }

    public double[][] getValue() {
        return value;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public void setValue(double[][] value) {
        this.value = value;
    }

}
