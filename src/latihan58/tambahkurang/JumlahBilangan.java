/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan58.tambahkurang;

/**
 *
 * @author Alfi Nurizkya
 * Nama     : Alfi Nurizkya
 * NIM      : 10119036
 * Kelas    : IF-1
 * Deskripsi Program : Program Memasukan Data Jumlah Bilangan
 */
public class JumlahBilangan extends Bilangan {

     public void tampilHasilJumlah() {
        int a, b;
        a = getX();
        b = getY();
        int result = a + b;
        System.out.println("Hasil perjumlahan = " + result);
    }
}
