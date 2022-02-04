/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pprogram_bunga_bank;
import java.util.Scanner;
/**
 *
 * @author waldy
 */
public class Pprogram_bunga_bank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int saldo;
               
        Scanner input = new Scanner (System.in); 
        System.out.println("Masukan jumlah saldo anda");
        saldo = input.nextInt();
               
        if ( saldo >= 100000000){
        System.out.println("bunga 2%/Tahun");        
        } else if (saldo >= 10000000 && saldo <= 15000000 ){
        System.out.println("bunga 00,10%/tahun");
        } else if ( saldo >= 2000000 && saldo <= 5000000 ){
        System.out.println("bunga 0%"); 
    }
  }
    
}
