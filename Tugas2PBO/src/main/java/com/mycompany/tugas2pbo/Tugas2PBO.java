/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas2pbo;

/**
 *
 * @author Acer
 */
import java.util.Scanner;
public class Tugas2PBO {
    public static void main(String[] args) {
        // Input tiga bilangan integer
        try (Scanner scanner = new Scanner(System.in)) {
            // Input tiga bilangan integer
            System.out.print("Masukkan bilangan pertama: ");
            int a = scanner.nextInt();
            
            System.out.print("Masukkan bilangan kedua: ");
            int b = scanner.nextInt();
            
            System.out.print("Masukkan bilangan ketiga: ");
            int c = scanner.nextInt();
            
            // Memeriksa apakah ketiga bilangan merupakan bilangan ribuan
            boolean isRibuanA = (a >= 1000 && a <= 9999);
            boolean isRibuanB = (b >= 1000 && b <= 9999);
            boolean isRibuanC = (c >= 1000 && c <= 9999);
            
            // Menampilkan hasil pemeriksaan
            System.out.println("Bilangan pertama " + a + " adalah ribuan: " + isRibuanA);
            System.out.println("Bilangan kedua " + b + " adalah ribuan: " + isRibuanB);
            System.out.println("Bilangan ketiga " + c + " adalah ribuan: " + isRibuanC);
        }
    }
}
