/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program_atm_bca;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Program_ATM_BCA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int pilihan, tambah,kurang, hasil, simpan;
        int saldo = 100000000;
        Scanner input = new Scanner (System.in);
        while(true){
            System.out.println("SELAMAT DATANG DI ATM BCA");
            System.out.println("-------- MENU ATM -------");
            System.out.println("1. LIHAT SALDO    -------");
            System.out.println("2. MENABUNG       -------");
            System.out.println("3. TARIK TUNAI    -------");
            System.out.println("4. KELUAR         -------");
            System.out.println("-------- ######## -------");
            System.out.println("MASUKAN PILIHAN ANDA");
            pilihan = Integer.parseInt(input.next());
            
            switch (pilihan){
                case 1:
                    System.out.println("sado anda adalah : Rp. "+ saldo);
                    break;
                    
                case 2:
                    System.out.println("masikan jumlah uang yang ingin anda tabung = Rp. ");
                    tambah = input.nextInt();
                    saldo += tambah;
                    System.out.println("saldo anda adalah Rp." + saldo);
                    break;
                    
                case 3:
                    System.out.println("Masukan jumlah uang yang anda ingin ambil = Rp. ");
                    kurang = input.nextInt();
                    System.out.println(saldo - kurang);
                    simpan = saldo - kurang;
                    if (simpan < 50000){
                        System.out.println("saldo anda adalah Rp." + saldo);
                    } else {
                        System.out.println("saldo anda adalah RP." + simpan);                       
                    }
                    break;
                    
                case 4:
                    System.exit(0);
                    break;
                                                          
                default:
                            System.out.println("anda harus memili menu (1,2,3,4)");
                            break;                                                                        
            }                                                                         
        }       
    }   
}
