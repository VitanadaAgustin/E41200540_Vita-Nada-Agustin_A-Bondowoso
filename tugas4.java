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
import java.util.Scanner;
public class tugas4 {
    //tugas 4
    public static void main(String[] args) {
        Scanner masukkan = new Scanner(System.in);

        String nama;

        System.out.println("-----------------------------------");
        System.out.println("Kharisma Agung Plaza <KAP> ");
        System.out.println("Promo Belamja Berhadiah");
        System.out.println("Khusus Pembelian 5 Barang Pertama");
        System.out.println("Dengan harga Minimun Rp.1.00000");
        System.out.println("------------------------------------");

        System.out.print("Masukkan nama anda = ");
        nama = masukkan.nextLine();

        System.out.println("Masukkan Harga Barang ke-1 :Rp.10000");
        System.out.println("Masukkan Harga Barang ke-2 :Rp.20000");
        System.out.println("Masukkan Harga Barang ke-3 :Rp.15000");
        System.out.println("Masukkan Harga Barang ke-4 :Rp.45000");
        System.out.println("Masukkan Harga Barang ke-5 :Rp.10000");
        System.out.println("-----------------------------------");
        System.out.println("Total harga pembeilan atas nama = " + nama + "   adalah RP.1.00000");

        System.out.println("Selamat....");
        System.out.println("Anda mendapat hadiah 1 buah mug cantik");
        System.out.println("-------------------------------------");
        System.out.println("\t"+"\t"+"Terimakasih");
        System.out.println("Anda sudah belanja di Kharisma Agung Plaza ");
    }

}
