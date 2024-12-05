/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematikaraul;

/**
 *
 * @author DELL
 */

public class MatematikaRaulCanggihBeraksi {
    public static void main(String[] args) {
        // Membuat objek dari kelas MatematikaRaul
        MatematikaRaul mtk = new MatematikaRaul();

        // Melakukan pengujian metode pertambahan
        System.out.println("Hasil pertambahan (int, 2 parameter): " + mtk.pertambahan(23, 24));
        System.out.println("Hasil pertambahan (double, 2 parameter): " + mtk.pertambahan(3.4, 4.9));
        System.out.println("Hasil pertambahan (int, 3 parameter): " + mtk.pertambahan(12, 28, 14));
        System.out.println("Hasil pertambahan (double, 3 parameter): " + mtk.pertambahan(12.5, 28.7, 14.2));

        // Melakukan pengujian metode pengurangan
        System.out.println("Hasil pengurangan (int, 2 parameter): " + mtk.pengurangan(23, 24));
        System.out.println("Hasil pengurangan (double, 2 parameter): " + mtk.pengurangan(3.4, 4.9));
        System.out.println("Hasil pengurangan (int, 3 parameter): " + mtk.pengurangan(12, 28, 14));
        System.out.println("Hasil pengurangan (double, 3 parameter): " + mtk.pengurangan(12.5, 28.7, 14.2));

        // Melakukan pengujian metode perkalian
        System.out.println("Hasil perkalian (int, 2 parameter): " + mtk.perkalian(23, 24));
        System.out.println("Hasil perkalian (double, 2 parameter): " + mtk.perkalian(3.4, 4.9));
        System.out.println("Hasil perkalian (int, 3 parameter): " + mtk.perkalian(12, 28, 14));
        System.out.println("Hasil perkalian (double, 3 parameter): " + mtk.perkalian(12.5, 28.7, 14.2));

        // Melakukan pengujian metode pembagian
        System.out.println("Hasil pembagian (int, 2 parameter): " + mtk.pembagian(23, 24));
        System.out.println("Hasil pembagian (double, 2 parameter): " + mtk.pembagian(3.4, 4.9));
        System.out.println("Hasil pembagian (int, 3 parameter): " + mtk.pembagian(12, 28, 14));
        System.out.println("Hasil pembagian (double, 3 parameter): " + mtk.pembagian(12.5, 28.7, 14.2));

        // Melakukan pengujian metode modulus
        System.out.println("Hasil modulus (int, 2 parameter): " + mtk.modulus(23, 24));
        System.out.println("Hasil modulus (double, 2 parameter): " + mtk.modulus(3.4, 4.9));
        System.out.println("Hasil modulus (int, 3 parameter): " + mtk.modulus(12, 28, 14));
        System.out.println("Hasil modulus (double, 3 parameter): " + mtk.modulus(12.5, 28.7, 14.2));

        // Membuat objek dari kelas MatematikaRaulCanggih
        MatematikaRaulCanggih mtkCanggih = new MatematikaRaulCanggih();

        // Menguji metode tambahan pada kelas MatematikaRaulCanggih
        System.out.println("Hasil operasi tiga angka (double): " + mtkCanggih.operasiTigaAngka(12.5, 28.7, 14.2));
        System.out.println("Hasil rata-rata tiga angka (double): " + mtkCanggih.rataRata(12.5, 28.7, 14.2));
    }
}