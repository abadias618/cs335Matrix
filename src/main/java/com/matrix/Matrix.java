package com.matrix;

/**
 * Core interface for matrix operations
 */
public interface Matrix {
    /**
     * Get the number of rows in the matrix
     * @return number of rows
     */
    int getRows();
    
    /**
     * Get the number of columns in the matrix
     * @return number of columns
     */
    int getColumns();
    
    /**
     * Get the value at the specified position
     * @param row the row index
     * @param col the column index
     * @return the value at the specified position
     */
    double get(int row, int col);
    
    /**
     * Set the value at the specified position
     * @param row the row index
     * @param col the column index
     * @param value the value to set
     */
    void set(int row, int col, double value);
    
    /**
     * Creates a deep copy of this matrix
     * @return a new matrix with the same values
     */
    Matrix copy();
}

