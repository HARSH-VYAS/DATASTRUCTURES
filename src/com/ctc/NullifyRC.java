package com.ctc;

/**
 * Created by Harsh P Vyas on 9/21/2016.
 */
public class NullifyRC {

    public void checkMat(int [][]mat){
        boolean []row = new boolean[mat.length];
        boolean []column = new boolean[mat[0].length];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==0) {
                    row[i] = true;
                    column[j] = true;
                }
            }
        }

        for(int i=0;i<mat.length;i++){
            if(row[i]) nullifyRow(mat, i);
        }


        for(int i=0;i<mat.length;i++){
            if(row[i]) nullifyColumn(mat, i);
        }

        printMat(mat);

    }

    public void nullifyRow(int [][]mat,int row){
        for(int i=0;i<mat[0].length;i++){
            mat[row][i]=0;
        }
    }

    public void nullifyColumn(int [][]mat,int col){

        for(int i=0;i<mat.length;i++){
            mat[i][col]=0;
        }
    }

    public void printMat(int [][] mat){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                System.out.println("i,j("+i+","+j+"):"+mat[i][j]);
            }
        }
    }


}
