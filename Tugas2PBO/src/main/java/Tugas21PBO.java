/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
import java.util.Scanner;
public class Tugas21PBO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input tiga bilangan
        System.out.print("Masukkan bilangan pertama: ");
        int a = scanner.nextInt();
        
        System.out.print("Masukkan bilangan kedua: ");
        int b = scanner.nextInt();
        
        System.out.print("Masukkan bilangan ketiga: ");
        int c = scanner.nextInt();
        
        // Menentukan nilai terbesar
        int terbesar = a;
        
        if (b > terbesar) {
            terbesar = b;
        }
        
        if (c > terbesar) {
            terbesar = c;
        }
        
        // Menampilkan nilai terbesar
        System.out.println("Nilai terbesar dari ketiga bilangan adalah: " + terbesar);
        
        scanner.close();
    }
}


