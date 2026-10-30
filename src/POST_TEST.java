/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author THINKPAD
 */
import java.util.Scanner;
public class POST_TEST {
    public static void main (String [] args){
         Scanner input = new Scanner(System.in);
         String nama, nim,prodi,fakultas;
         System.out.print("Siapa Nama Anda : ");
         nama = input.nextLine();
         System.out.print("Nim : ");
         nim = input.nextLine();
         System.out.print("prodi : ");
         prodi = input.nextLine();
         System.out.print("Fakultas : ");
         fakultas = input.nextLine();
            
            System.out.println("--HASIL INPUTAN--");
        System.out.println("Nama\t : " + nama);
        System.out.println("nim\t : " + nim);
        System.out.println("Program Studi\t : " + prodi);
        System.out.println("fakultas\t : " + fakultas );
        input.close();
            
        
    }
}
