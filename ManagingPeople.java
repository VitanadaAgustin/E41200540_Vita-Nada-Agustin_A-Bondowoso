/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

/**
 *
 * @author hp
 */
public class ManagingPeople {
    public static void main(String[] args){
        
        Person p1 = new Person("Vita" , "Vita Nada Agustin" , "E41200540" , "Active ");
        
        
        if(!p1.getStatus().equals("Active") ){
            System.out.println(p1.getNamapanjang() + " Bukan mahasiswa aktif ");
        } else {
            System.out.println(p1.getNamapanjang() + " Adalah Mahasiswa Aktiv" );
        }
    
}}
