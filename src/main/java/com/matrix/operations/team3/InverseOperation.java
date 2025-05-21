package com.matrix.operations.team3;

import com.matrix.core.Matrix;

public class InverseOperation {
    /**
     * Calculate the inverse of a 2x2 matrix
     * @param matrix the input matrix
     * @return the inverse matrix
     * @throws IllegalArgumentException if the matrix is not 2x2 or is singular
     */
    public Matrix inverse(Matrix matrix) {
        if (matrix.getRows() != 2 || matrix.getColumns() != 2) {
            throw new IllegalArgumentException("This implementation only supports 2x2 matrices");
        }

        double det = matrix.get(0, 0) * matrix.get(1, 1) - matrix.get(0, 1) * matrix.get(1, 0);

        if (Math.abs(det) < 1e-10) {
            throw new IllegalArgumentException("Matrix is singular and cannot be inverted");
        }

        // Implementation here for 2x2 matrix inverse

        return result;
    }
}
