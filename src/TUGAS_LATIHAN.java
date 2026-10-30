/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author THINKPAD
 */
import java.util.Scanner;
public class TUGAS_LATIHAN {
    public static void main (String [] args){
     Scanner input = new Scanner(System.in);
      double MP, UTS, UAS, nilai_akhir;
      System.out.print("Masukkan Nilai MP  : ");
      MP = input.nextDouble();
      System.out.print("Masukkan Nilai UTS : ");
      UTS = input.nextDouble();
      System.out.print("Masukkan Nilai UAS : ");
      UAS = input.nextDouble();
      nilai_akhir = (6 * MP + 2 * UTS + 2 * UAS) / 10;
     System.out.println("Nilai MP     : " + MP);
     System.out.println("Nilai UTS    : " + UTS);
     System.out.println("Nilai UAS    : " + UAS);
     System.out.println("Nilai Akhir  : " + nilai_akhir);

        input.close();
    }
}
 

