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

        double result;

        if (n == 2) {
            double a = matrix.get(0, 0); // ....
            double b = matrix.get(0, 1);
            double c = matrix.get(1, 0);
            double d = matrix.get(1, 1);
            result = a * d - b * c;
        } else if (n == 3) {
            double a = matrix.get(0, 0);
            double b = matrix.get(0, 1);
            double c = matrix.get(0, 2);
            double d = matrix.get(1, 0);
            double e = matrix.get(1, 1);
            double f = matrix.get(1, 2);
            double g = matrix.get(2, 0);
            double h = matrix.get(2, 1);
            double i = matrix.get(2, 2);
            result = a * (e * i - f * h) - b * (d * i - f * g) + c * (d * h - e * g);
        } else {
            throw new IllegalArgumentException("Unsupported matrix size");
        }

        return result;
    }
}
