package com.matrix.operations.team1;

import com.matrix.core.Matrix;

public class AdditionOperation {
    /**
     * Add two matrices
     * @param a first matrix
     * @param b second matrix
     * @return result of a + b
     * @throws IllegalArgumentException if dimensions don't match
     */
    public Matrix add(Matrix a, Matrix b) {
        if (a.getRows() != b.getRows() || a.getColumns() != b.getColumns()) {
            throw new IllegalArgumentException("Matrix dimensions don't match for addition");
        }

        // Implementation here

        return result;
    }
}
