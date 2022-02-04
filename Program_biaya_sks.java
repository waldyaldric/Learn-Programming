/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program_biaya_sks;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class Program_biaya_sks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int angkatan;
                
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan angkatan");
        angkatan = input.nextInt();
        
        if(angkatan <= 2018){
            System.out.println("Biaya kuliah semester ini = Rp.5.000.000");
        }
        
        else if(angkatan >= 2019){
            String fak;
            int x,y,biaya;
            System.out.println("Masukan fakultas");
            fak = input.next();
            
            if ("FTI".equalsIgnoreCase(fak)){
            } else {
                System.out.println("Maukan sks tatap muka");
                x = input.nextInt();
                System.out.println("Maukan sks tatap praktikum");
                y = input.nextInt();
                
                if(x+y >= 24){
                    biaya = 250000+(x*100000)+(y*150000);
                    System.out.println("Biaya semester ini = Rp. "+biaya);                   
                }
                
                else{
                    System.out.println("Jumlah sks dari 24");
                }                         
            }
            if("FTI".equalsIgnoreCase(fak)){
                System.out.println("Maukan sks tatap muka");
                x = input.nextInt();
                System.out.println("Maukan sks tatap praktikum");
                y = input.nextInt();
                if(x+y <= 24){
                    biaya = 250000+(x*100000)+(y*150000);
                    System.out.println("Biaya semester ini = Rp. "+biaya); 
                }
                    else{
                    System.out.println("Jumlah sks dari 24");
                }             
            }
            else if("FI".equalsIgnoreCase(fak)){
                System.out.println("Maukan sks tatap muka");
                x = input.nextInt();
                System.out.println("Maukan sks tatap praktikum");
                y = input.nextInt();
                if(x+y <= 24){
                    biaya = 250000+(x*100000)+(y*150000);
                    System.out.println("Biaya semester ini = Rp. "+biaya); 
                }
                else{
                    System.out.println("Jumlah sks dari 24");
                }
            }
            else if("FH".equalsIgnoreCase(fak)){
                System.out.print("Masukan sks tatap muka");
                x = input.nextInt();
                if(x <= 24){
                    biaya = 2275000 +(x*100000);
                    System.out.println("Biaya semester ini = Rp. "+biaya);                     
                    }
                else{
                    System.out.println("Jumlah sks dari 24");
                }
            }
            else if("FE".equalsIgnoreCase(fak)|| "FPSI".equalsIgnoreCase(fak)){
                System.out.print("Masukan sks tatap muka");
                x = input.nextInt();
                if (x <= 24){
                    biaya = 215000 + (x*100000);
                    System.out.println("Biaya semester ini = Rp. "+biaya);                     
                    }
                else{
                    System.out.println("Jumlah sks dari 24");
                }
            }
        }
    }
}                 
                


        