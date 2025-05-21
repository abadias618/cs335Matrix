package com.matrix.operations.team3;

import com.matrix.core.Matrix;

public class DeterminantOperation {
    /**
     * Calculate the determinant of a matrix (limited to 2x2 and 3x3)
     * @param matrix the input matrix
     * @return the determinant value
     * @throws IllegalArgumentException if the matrix is not square or larger than 3x3
     */
    public double determinant(Matrix matrix) {
        int n = matrix.getRows();

        if (matrix.getColumns() != n) {
            throw new IllegalArgumentException("Matrix must be square to calculate determinant");
        }

        if (n > 3) {
            throw new IllegalArgumentException("This implementation only supports 2x2 and 3x3 matrices");
        }

        // Implementation here for 2x2 and 3x3 matrices

        return result;
    }
}
