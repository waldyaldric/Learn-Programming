/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;
/**
 *
 * @author Asu
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int harga1;
    int harga2;
    int harga3;
    double diskon;
    int total_diskon;
    int total;    
        
    Scanner input = new Scanner(System.in); 
    System.out.println("Silahkan masukkan harga barang pertama : ");
    harga1 = input.nextInt();
    System.out.println("Silahkan masukkan harga barang kedua : ");
    harga2 = input.nextInt();
    System.out.println("Silahkan masukkan harga barang ketiga : ");
    harga3 = input.nextInt();
    
    total = harga1 + harga2 + harga3;
    
    System.out.println("Maka total semua barang Anda adalah = "+total);
    
    if(total >= 250000){
        System.out.println("Anda mendapatkan diskon sebesar 15%");
        diskon = 0.15;
        total_diskon = (int) (total * diskon) ;
        total = total - total_diskon;
        System.out.println("Total harga barang setelah diskon adalah "+total);
    } else {
        System.out.println("Anda tidak mendapatkan diskon");
        System.out.println("Total harga barang Anda adalah "+total);
    }
    } 
    
}
    
