package com.company;

public class Mahasiswa {
    String nim, nama, alamat;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
    public String getAlamat() {
        return alamat;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }
}
