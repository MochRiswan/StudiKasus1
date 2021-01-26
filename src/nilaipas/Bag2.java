/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilaipas;

import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class Bag2 {
    String Nama,Nik,Kelas,sklh;
    int N;
    Scanner I = new Scanner(System.in);
    
    void buka(){//method pembukaaan
        System.out.println("Silakan konversi nilai mapel anda");
        System.out.println("=================================");
    }
    
    void input(){//method void yang isinya syntax inputan user
        System.out.print("Masukkan Nama\t\t: ");
        Nama = I.nextLine();
        System.out.print("Masukkan Nis\t\t: ");
        Nik = I.nextLine();
        System.out.print("Masukkan Kelas\t\t: ");
        Kelas = I.nextLine();
        System.out.print("Masukkan sekolah\t: ");
        sklh = I.nextLine();
    }
    void pilah(){//method untuk input nilai serta percabagan kelas nilai
        System.out.print("Masukkan Nilai Mapel\t: "); //
        N = I.nextInt();                              //inputan nilai oleh user
        System.out.print("Nilai mapel anda\t: ");
        if (N >= 90)//percabangan yang digunakan untuk menentukan kelas nilai
            System.out.println("A\nSemangat!!\nPertahankan nilai anda");
        else if (N >= 75)
            System.out.println("B\nSemangat!!\nTingkatkan nilainyaa");
        else if (N >= 50)
            System.out.println("C\nSemangat!!\nBelajar lagi yaa");
        else if (N >= 35)
            System.out.println("D\nSemangat!!\nBelajarnya ditingkatkan yaa");
        else
            System.out.println("E\nBelajarnya ditingkatkan yaa\nHati-hati dengan nilai mu");
    }
}
