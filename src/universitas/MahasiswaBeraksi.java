/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitas;

/**
 *
 * @author user
 */


public class MahasiswaBeraksi {
    public static void main(String[] args) {
        // Membuat objek mahasiswa1 dari class Mahasiswa dengan constructor
        Mahasiswa mahasiswa1 = new Mahasiswa("19630959", "abdul gani", "Teknik Informatika");

        // Menggunakan setter untuk mengubah nilai npm, nama, dan prodi
        mahasiswa1.setNpm("19630959");
        mahasiswa1.setNama("abdul gani");
        mahasiswa1.setProdi("teknik informatika");

        // Mencetak detail mahasiswa1 menggunakan getter
        System.out.println(mahasiswa1.getDetail());
    }
}


