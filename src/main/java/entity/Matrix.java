package entity;


import java.util.Arrays;
import java.util.Random;

public class Matrix {
    private int rows;
    private int collums;
    private double[][] value;

    public Matrix() {
    }

    public void fillRandom(){
        value= new double[getRows()][getCollums()];
        for (int i = 0; i < value.length; i++) {
            for (int j = 0; j < value[i].length; j++) {
                Random random = new Random();
                value[i][j]=random.nextInt(100);
            }
        }
        System.out.println(Arrays.deepToString(value));
    }

    public Matrix(int rows, int collums) {
        this.rows = rows;
        this.collums = collums;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getCollums() {
        return collums;
    }

    public void setCollums(int collums) {
        this.collums = collums;
    }

    public double[][] getValue() {
        return value;
    }

    public void setValue(double[][] value) {
        this.value = value;
    }

}
