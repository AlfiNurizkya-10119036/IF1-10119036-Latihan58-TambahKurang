
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
 * Deskripsi Program : Program Memasukan Data Selisih Bilangan
 */
public class SelisihBilangan extends Bilangan {

    public void tampilSelisih() {
        int a, b;
        a = getX();
        b = getY();
        int result = a - b;
        System.out.println("Hasil Selisih " + a + " - " + b + " = " + result);
    }
}
