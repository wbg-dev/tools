package SparseMatrix.tools;

import SparseMatrix.tools.Impl.SparseMatrixToolsImpl;

import java.util.ArrayList;
import java.util.Scanner;

public class SparseMatrixTools implements SparseMatrixToolsImpl {

    private int arrow=0;
    private Scanner sc=new Scanner(System.in);

    @Override
    public void outputArray(int[][] originArray) {
        for (int[] OriginArray : originArray) {
            for (int j = 0; j < originArray[0].length; j++) {
                System.out.print(OriginArray[j] + " ");
                if (j == originArray[0].length-1) {
                    System.out.println();
                }
            }
        }
    }

    @Override
    public ArrayList<Integer> transferToSparseMatrix(int[][] originArray) {
        arrow=0;
        ArrayList <Integer> sparseMatrix =new ArrayList <>();
        ArrayList<int[]> querySize =new ArrayList<>();
        // 查询作用 查到数值总个数
        for (int i = 0; i <originArray.length ; i++) {
            for (int j = 0; j < originArray[0].length ; j++) {
                if (originArray[i][j]!=0){
                    int[] temp= new int[]{i, j, originArray[i][j]};
                    querySize.add(i, temp);
                }
            }
        }
        int firstArrayAndColumn[]={originArray.length,originArray[0].length,querySize.size()};
        //这里写3 是因为将首行进行填充时 总共就3列 写定值比较好
        for (; arrow <3 ; arrow++) {
            sparseMatrix.add(arrow,firstArrayAndColumn[arrow]);
        }
        for (int i = 0; i <originArray.length ; i++) {
            for (int j = 0; j < originArray[0].length ; j++) {
                if (originArray[i][j]!=0){
                    int[] temp= new int[]{i, j, originArray[i][j]};
                    temp[0]+=1;
                    temp[1]+=1;
                    sparseMatrix.add(arrow++,temp[0]);
                    sparseMatrix.add(arrow++,temp[1]);
                    sparseMatrix.add(arrow++,temp[2]);
                }
            }
        }
        return sparseMatrix;
    }

    @Override
    public void outputSparseMatrix(ArrayList<Integer> sparseMatrix) {
        arrow=1;
        for (int i = 0; i <sparseMatrix.size(); i++,arrow++) {
            System.out.print(sparseMatrix.get(i)+" ");
            //这里写定值的原因是因为二维稀疏矩阵必为三列，写定值更好。
            if (arrow%3==0)
                System.out.println(" ");
        }
    }

    @Override
    public ArrayList<Integer> transferToOriginMatrix(ArrayList<Integer> sparseMatrix) {
        ArrayList<Integer> originMatrix= new ArrayList<>();
        int startArray= 3;
        int startColumn=4;
        int startNumber=5;
        //数列结束位置标志数字
        int endArrowNumber=2+3*(sparseMatrix.get(2));
        int totalElementNumber=sparseMatrix.get(0)*sparseMatrix.get(1);

        //判断表达式内 确定矩阵包含元素总个数
        for (int i = 0; i <totalElementNumber ; i++) {
            //这里写定值5，因为稀疏矩阵的第一行的数据的位置永远在ArrayList的第5位.
            if (startNumber>endArrowNumber){
                // i是代表现在的位置
                int continueNumber = totalElementNumber - i;
                for (int j = 0; j <continueNumber ; j++) {
                    originMatrix.add(i++, 0);
                }
                break;
            }
            if (i!=(sparseMatrix.get(startArray)-1)*(sparseMatrix.get(1))+sparseMatrix.get(startColumn)-1) {

                originMatrix.add(i, 0);

            }else {
                originMatrix.add(i,sparseMatrix.get(startNumber));
                startArray+=3;
                startColumn+=3;
                startNumber+=3;
            }
        }
        return originMatrix;
    }

    @Override
    public void outputOriginMatrix(ArrayList<Integer> originMatrix,ArrayList<Integer> sparseMatrix) {
        arrow=1;
        for (int i = 0; i <originMatrix.size() ; i++,arrow++) {
            System.out.print(originMatrix.get(i)+" ");
            //这里不应该再写定值。
            if (arrow%sparseMatrix.get(1)==0){
                System.out.println(" ");
            }
        }
    }

    @Override
    public void outputSparseMatrixLine(ArrayList<Integer> sparseMatrix) {
        double bestNumber = (double) 3 / 0.618;
        bestNumber = Math.ceil(bestNumber);
        for (int i = 0; i < bestNumber; i++) {
            System.out.print("* ");
        }
        System.out.println(" ");
    }

    @Override
    public void outputArrayLine(int[][] array) {
        double bestNumber = (double) array[0].length / 0.618;
        bestNumber = Math.ceil(bestNumber);
        for (int i = 0; i < bestNumber; i++) {
            System.out.print("* ");
        }
        System.out.println(" ");
    }

    @Override
    public void outputOriginMatrixLine(ArrayList<Integer> sparseMatrix) {
        double bestNumber = (double) sparseMatrix.get(1) / 0.618;
        bestNumber = Math.ceil(bestNumber);
        for (int i = 0; i < bestNumber; i++) {
            System.out.print("* ");
        }
        System.out.println(" ");
    }

    @Override
    public void outputArray(int array,int column) {

        outputArray(getOutputArray(array,column));
    }

    @Override
    public int[][] getOutputArray(int array, int column) {
        ArrayList<Integer> arrayList=new ArrayList<>();

        while (sc.hasNextInt()) {
            arrayList.add(arrow++, sc.nextInt());
            if (arrayList.size()==array*column)
                break;
        }

        arrow=0;
        int[][] tempArray=new int [array][column];
        for (int j = 0; j < array; j++) {
            for (int k = 0; k <column ; k++) {
                tempArray[j][k]=arrayList.get(arrow++);
            }
        }
        return tempArray;
    }

}
