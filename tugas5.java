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
public class tugas5 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama;
        int pilihan;

        System.out.println("\t"+"Cafe Ceria");
        System.out.println("\t"+"Aneka Minuman");
        System.out.println("-----------------------");

        System.out.println("\t" +"SPECIAL MENU");
        System.out.println("1.Soft Drinks");
        System.out.println("2.Mix Juice");
        System.out.println("3.Nescafe");
        System.out.println("4.Soda Milk");
        System.out.println("5.Tea");
        System.out.println("-----------------------");

        System.out.print("masukkan nama = ");
        nama = input.nextLine();

        System.out.print("Silahkan masukkan pilihan = ");
        pilihan = input.nextInt();

        switch (pilihan){
            case 1:
                System.out.print("Minuman yang anda pesan adalah = ");
                System.out.println("Soft Drinks ");
                break;
            case 2:
                System.out.print("Minuman yang anda pesan adalah = ");
                System.out.println("Mix Juice");
                break;
            case 3 :
                System.out.print("Minuman yang anda pesan adalah = ");
                System.out.println("Nescafe");
                break;
            case 4 :
                System.out.print("Minuman yang anda pesan adalah = ");
                System.out.println("Soda Milk");
                break;
            case 5 :
                System.out.print("Minuman yang anda pesan adalah = ");
                System.out.println("Tea");
                break;
        }

        System.out.println("Pesanan akan segera kami antar");
        System.out.println("Terimakasih " + nama + "Telah berkunjung Di Cafe Senyum");



    }
}

