/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
import java.util.Scanner;
public class Tugas22PBO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input jam masuk dan jam keluar
        System.out.print("Masukkan jam masuk: ");
        int jamMasuk = scanner.nextInt();
        
        System.out.print("Masukkan jam keluar: ");
        int jamKeluar = scanner.nextInt();
        
        // Menghitung lama parkir
        int lamaParkir;
        if (jamKeluar >= jamMasuk) {
            lamaParkir = jamKeluar - jamMasuk;
        } else {
            lamaParkir = (24 - jamMasuk) + jamKeluar;
        }
        
        // Menghitung biaya parkir
        int biayaParkir;
        if (lamaParkir <= 2) {
            biayaParkir = 1500;
        } else {
            biayaParkir = 1500 + (lamaParkir - 2) * 1000;
        }
        
        // Menampilkan hasil
        System.out.println("Lama Parkir: " + lamaParkir + " Jam");
        System.out.println("Tarif Parkir: Rp" + biayaParkir);
        
        scanner.close();
    }
}


