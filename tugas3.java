/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsi.pkg2;

/**
 *
 * @author hp
 */
public class tugas3 {
    // tugas 3
    public static void main(String[] args) {
        int [] [] array2d = {
                {5,6,1,7},
                {8,1,2,9},
                {5,4,7,1},
                {8,3,7,5}};

        for (int i = 0; i <array2d.length;i++){
            for (int j = 0; j< array2d.length;j++){
                System.out.print(array2d [i] [j]);
            }
            System.out.println();
        }
    }
    
}
