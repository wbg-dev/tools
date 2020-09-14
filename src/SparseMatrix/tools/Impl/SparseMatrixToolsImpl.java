package SparseMatrix.tools.Impl;

import java.util.ArrayList;

public interface SparseMatrixToolsImpl {
    void outputArray(int[][] originArray);

    ArrayList<Integer> transferToSparseMatrix(int[][] originArray);

    void outputSparseMatrix(ArrayList <Integer> sparseMatrix);

    ArrayList<Integer> transferToOriginMatrix(ArrayList <Integer> sparseMatrix);

    void outputOriginMatrix(ArrayList<Integer> originMatrix,ArrayList<Integer> sparseMatrix);

    void outputSparseMatrixLine(ArrayList<Integer> sparseMatrix);

    void outputArrayLine(int [][] array);

    void outputOriginMatrixLine(ArrayList<Integer> sparseMatrix);

    void outputArray(int array,int column);

    int [][] getOutputArray(int array,int column);



}
