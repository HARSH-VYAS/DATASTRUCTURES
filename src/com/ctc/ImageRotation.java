package com.ctc;

/**
 * Created by Harsh P Vyas on 9/21/2016.
 */
public class ImageRotation {

    public boolean rotateImage(int [][]mat){

        int n = mat.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println("i,j("+i+","+j+"):"+mat[i][j]);
            }
        }

        if(mat.length<0 || mat[0].length !=mat.length)
            return false;


        for(int layer=0;layer<n/2;layer++){

            int first = layer;
            int last = n-1-layer;
            for(int i=first;i<last;i++){
                int offset = i-first;
                int temp = mat[first][i];
                mat[first][i]= mat[last-offset][first];
                mat[last-offset][first] = mat[last][last-offset];
                mat[last][last-offset]= mat[i][last];
                mat[i][last]= temp;
            }
        }

        System.out.println("After Rotation");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
            System.out.println("i,j("+i+","+j+"):"+mat[i][j]);
            }
        }
        return true;
    }

}
