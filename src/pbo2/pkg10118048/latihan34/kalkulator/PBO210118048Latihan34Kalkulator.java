/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118048.latihan34.kalkulator;

import java.util.Scanner;

/**
 *
 * @author NIX
 * NAMA : Niko Yama
 * KELAS : PBO2
 * NIM : 10118048
 * Deskripsi program : kalkulator sederhana
 */
public class PBO210118048Latihan34Kalkulator {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Kalkulator kalkulator = new Kalkulator();
        System.out.println("=====Aplikasi Kalkulator Bilangan=====");
        System.out.print("Masukkan Angka ke-1 : ");
        kalkulator.value1 = scanner.nextDouble();
        System.out.print("Masukkan Angka ke-2 : ");
        kalkulator.value2 = scanner.nextDouble();
        System.out.println("\nHasil Pertambahan\t: " +kalkulator.tambahBilangan()
                + "\nHasil Pengurangan\t: " +kalkulator.kurangBilangan()
                + "\nHasil Perkalian\t\t: " +kalkulator.kaliBilangan()
                + "\nHasil Pembagian\t\t: " +kalkulator.bagiBilangan()
                + "\nHasil Sisa\t\t: " +kalkulator.sisaBilangan()
        );
    }
}
