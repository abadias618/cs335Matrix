package com.matrix.operations.team2;

import com.matrix.core.Matrix;

public class MultiplicationOperation {
    /**
     * Multiply two matrices
     * @param a first matrix
     * @param b second matrix
     * @return result of a * b
     * @throws IllegalArgumentException if dimensions don't allow multiplication
     */
    public Matrix multiply(Matrix a, Matrix b) {
        if (a.getColumns() != b.getRows()) {
            throw new IllegalArgumentException("Matrix dimensions don't allow multiplication");
        }

        // Implementation here

        return result;
    }
}
