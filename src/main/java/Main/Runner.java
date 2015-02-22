package Main;

import entity.Matrix;

import java.util.Arrays;


public class Runner {
    public static void main(String[] args) {
        //Input data
        int rows = 3;
        int columns = 3;
        Matrix matrix = new Matrix();
        Matrix matrixA = new Matrix(rows, columns);
        matrixA.fillRandom();
        Matrix matrixB = new Matrix(rows, columns);
        matrixB.fillRandom();
        Matrix matrixResult = new Matrix();

        if (matrixA.getRows() == matrixB.getColumns()) {
            System.out.println("Result:");
            matrixResult = matrixResult.multiply(matrixA, matrixB);
            matrixResult.printMatrix();
        } else System.out.println("Wrong input data");


    }




}
