
import universitas.Mahasiswa;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class mahasiswaberaksii {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // Membuat objek mahasiswa1 dari class Mahasiswa dengan constructor
        Mahasiswa mahasiswa1 = new Mahasiswa("19630959", "abdul gani", "Teknik Informatika");

        // Menggunakan setter untuk mengubah nilai npm, nama, dan prodi
        mahasiswa1.setNpm("1630959");
        mahasiswa1.setNama("abdul gani");
        mahasiswa1.setProdi("teknik informatika");

        // Mencetak detail mahasiswa1 menggunakan getter
        System.out.println(mahasiswa1.getDetail());
    }
}
 