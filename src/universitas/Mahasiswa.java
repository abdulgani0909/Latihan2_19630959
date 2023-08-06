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


public class Mahasiswa {
    private String npm;
    private String nama;
    private String prodi;

    // Constructor dengan parameter npm, nama, dan prodi
    public Mahasiswa(String npm, String nama, String prodi) {
        this.npm = npm;
        this.nama = nama;
        this.prodi = prodi;
    }

    // Getter npm
    public String getNpm() {
        return npm;
    }

    // Setter npm
    public void setNpm(String npm) {
        this.npm = npm;
    }

    // Getter nama
    public String getNama() {
        return nama;
    }

    // Setter nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter prodi
    public String getProdi() {
        return prodi;
    }

    // Setter prodi
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getDetail() {
        return "NPM: " + npm + ", Nama: " + nama + ", Prodi: " + prodi;
    }
}

