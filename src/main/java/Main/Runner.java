package Main;

import entity.Matrix;


public class Runner {
    public static void main(String[] args) {
        int rows = 3;
        int columns = 3;

        Matrix matrix = new Matrix();

        Matrix matrixA = new Matrix(rows, columns);
        matrixA.fillRandom();
        System.out.println("----------------");
        Matrix matrixB = new Matrix(rows, columns);
        matrixB.fillRandom();
        System.out.println("----------------");
        Matrix matrixResult = new Matrix(rows,columns);
        if (matrixA.getRows()==matrixB.getColumns()) {
            System.out.println("Result:");
        //    matrixResult = multiply(matrixA, matrixB);
        }
        else System.out.println("Wrong input data");




    }

    private static Matrix multiply(Matrix matrixA, Matrix matrixB) {
        Matrix matrixResult = new Matrix();
        matrixResult.fillRandom();
        //double[][] matrix =  matrixResult.getValue();
        int aRows = matrixA.getRows();
        int aColumns = matrixA.getColumns();
        int bRows = matrixB.getRows();
        int bColumns = matrixB.getColumns();
        for (int i = 0; i < matrixResult.getValue().length; i++) {
            for (int j = 0; j < matrixResult.getValue()[i].length; j++) {
                for (int k = 0; k < matrixResult.getValue().length; k++) {

                }

            }
        }

        return matrixResult;
    }


}
