package com.matrix;

import com.matrix.core.MatrixImpl;

public class Main {
    public static void main(String[] args) {
        System.out.println("Our Java Implementation of Matrix Operations!");
        MatrixImpl m = new MatrixImpl(2,2);
        MatrixImpl m2 = new MatrixImpl(new double[2][2]);
        System.out.println(m);
    }
}