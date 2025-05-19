package com.matrix;

/**
 * Implementation of the Matrix interface
 */
public class MatrixImpl implements Matrix {
    private final double[][] data;
    private final int rows;
    private final int columns;
    
    /**
     * Create a new matrix with the specified dimensions
     * @param rows number of rows
     * @param columns number of columns
     */
    public MatrixImpl(int rows, int columns) {
        if (rows <= 0 || columns <= 0) {
            throw new IllegalArgumentException("Matrix dimensions must be positive");
        }
        
        this.rows = rows;
        this.columns = columns;
        this.data = new double[rows][columns];
    }
    
    /**
     * Create a new matrix from a 2D array
     * @param data the 2D array
     */
    public MatrixImpl(double[][] data) {
        if (data == null || data.length == 0 || data[0].length == 0) {
            throw new IllegalArgumentException("Invalid data for matrix");
        }
        
        this.rows = data.length;
        this.columns = data[0].length;
        this.data = new double[rows][columns];
        
        for (int i = 0; i < rows; i++) {
            if (data[i].length != columns) {
                throw new IllegalArgumentException("All rows must have the same length");
            }
            System.arraycopy(data[i], 0, this.data[i], 0, columns);
        }
    }
    
    @Override
    public int getRows() {
        return rows;
    }
    
    @Override
    public int getColumns() {
        return columns;
    }
    
    @Override
    public double get(int row, int col) {
        if (row < 0 || row >= rows || col < 0 || col >= columns) {
            throw new IndexOutOfBoundsException("Matrix indices out of bounds");
        }
        return data[row][col];
    }
    
    @Override
    public void set(int row, int col, double value) {
        if (row < 0 || row >= rows || col < 0 || col >= columns) {
            throw new IndexOutOfBoundsException("Matrix indices out of bounds");
        }
        data[row][col] = value;
    }
    
    @Override
    public Matrix copy() {
        MatrixImpl result = new MatrixImpl(rows, columns);
        for (int i = 0; i < rows; i++) {
            System.arraycopy(data[i], 0, result.data[i], 0, columns);
        }
        return result;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            sb.append("[ ");
            for (int j = 0; j < columns; j++) {
                sb.append(data[i][j]);
                if (j < columns - 1) {
                    sb.append(", ");
                }
            }
            sb.append(" ]\n");
        }
        return sb.toString();
    }
}