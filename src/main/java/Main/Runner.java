package Main;

import entity.Matrix;


public class Runner {
    public static void main(String[] args) {
        int rows = 3;
        int collums = 3;

        Matrix matrix = new Matrix();

        Matrix matrixA = new Matrix(rows, collums);
        matrixA.fillRandom();
        System.out.println("----------------");
        Matrix matrixB = new Matrix(rows, collums);
        matrixB.fillRandom();
        System.out.println("----------------");
        Matrix matrixResult = new Matrix(rows,collums);
        matrixResult.fillRandom();
        if (matrixA.getRows()==matrixB.getCollums()){
            System.out.println("Result:");
        //    matrixResult = multiply(matrixA, matrixB);
        }
        else System.out.println("Wrong input data");




    }

    private static Matrix multiply(Matrix matrixA, Matrix matrixB) {
        Matrix matrixResult = new Matrix();
        matrixResult.fillRandom();
        matrixResult.getValue();
        for (int i = 0; i < matrixResult.getValue().length; i++) {
            for (int j = 0; j < matrixResult.getValue()[i].length; j++) {

            }
        }

        return matrixResult;
    }


}
