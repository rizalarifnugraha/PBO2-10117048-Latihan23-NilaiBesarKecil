/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117048.latihan23.nilaibesarkecil;

import java.util.Scanner;

/**
 *
 * @author 
 *  Nama  : Rizal Arif Nugraha
 * Nim   : 10117048
 * Kelas : PBO2
 * Deskripsi Program : Program ini menampilkan nilai terbesar dan nilai terkecil.
 */
public class PBO210117048Latihan23NilaiBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        String pts;
        int jumlahMahasiswa;
        int nilai[] = new int[20];
        int i, max, min;
        
        Scanner value = new Scanner(System.in);
        
        System.out.println("===== Program Nilai Terbesar Dan Terkecil =====");
        System.out.print("Masukkan Nama Petugas\t : ");
        pts = value.nextLine();
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa\t : ");
        jumlahMahasiswa = value.nextInt();
        System.out.println("");
        
        for (i = 1; i <= jumlahMahasiswa; i++){
            System.out.print("Masukkan Nilai Mahasiswa ke-" + i + " : ");
            nilai[i] = value.nextInt();
        }
        
        System.out.println("");
        System.out.println("===== Hasil Nilai Mahasiswa =====");
        for (i = 1; i <= jumlahMahasiswa; i++) {
            System.out.println("Nilai Mahasiswa ke-" + i + " = " + nilai[i]);
        }
    min = nilai[1];
    max = nilai[1];
    
    for (i = 1; i <= jumlahMahasiswa; i++){
        if (nilai[i] > max){
            max = nilai[i];
        } else if (nilai[i] < min) {
            min = nilai[i];
        }
      }
    
        System.out.println("");
        System.out.println("Nilai Terbesar\t : " + max);
        System.out.println("Nilai Terkecil\t : " + min);
        System.out.println("");
        System.out.println("Nama Petugas : " + pts);
    }
    
}
