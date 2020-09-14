package SparseMatrix;

import SparseMatrix.tools.SparseMatrixTools;

//import java.util.ArrayList;

public class SparseMatrixTest {

    public static void main(String[] args) {
        // 初始化二维数组，并以矩阵形式输出。
//         定义一个指针
        //7×7矩阵
//        int [][] originArray = {{0,0,0,0,0,0,1},{0,2,0,0,0,0,0},{0,0,3,0,4,0,0},{0,5,0,0,0,6,0},
//                {0,7,0,0,0,0,0},{0,0,9,0,0,10,0},{0,0,11,8,0,0,0}};
        //6×7矩阵
//        int [][] originArray = {{0,0,0,0,0,0,1},{0,2,0,0,0,0,0},{0,0,3,0,4,0,0},{0,5,0,0,0,6,0},
//                {0,7,0,0,0,0,0},{0,0,9,0,0,10,0}};
        //7×6矩阵
//        int [][] originArray = {{0,0,0,0,0,1},{2,0,0,0,0,0},{0,3,0,4,0,0},{5,0,0,0,6,0},
//                {7,0,0,0,0,0},{0,9,0,0,10,0},{0,0,8,0,0,11}};




        SparseMatrixTools sparseMatrixTools=new SparseMatrixTools();
        sparseMatrixTools.outputArray(6,7);

//        sparseMatrixTools.outputArray(originArray);
//        sparseMatrixTools.outputArrayLine(originArray);
//
//        ArrayList<Integer> sparseMatrix = sparseMatrixTools.transferToSparseMatrix(originArray);
//
//        sparseMatrixTools.outputSparseMatrix(sparseMatrix);
//        sparseMatrixTools.outputSparseMatrixLine(sparseMatrix);
//
//
//        ArrayList<Integer> originMatrix = sparseMatrixTools.transferToOriginMatrix(sparseMatrix);
//
//        sparseMatrixTools.outputOriginMatrix(originMatrix,sparseMatrix);
//        sparseMatrixTools.outputOriginMatrixLine(sparseMatrix);


    }

}
