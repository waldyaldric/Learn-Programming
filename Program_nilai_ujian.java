/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        // TODO code application logic here
        int nilai;
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan nilai ujian anda=");
        nilai= sc.nextInt();
        if (nilai >= 80){
        System.out.println("Lulus");  
        }
        else{
        System.out.println(" Tidak Lulus=");

        }
     }
}
    
    

