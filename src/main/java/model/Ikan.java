/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author AjiHowhow
 */
public class Ikan {
    private String idIkan;
    private String namaIkan;
    private String jenisIkan;
    private int jumlahStok;

    public Ikan(String idIkan, String namaIkan, String jenisIkan, int jumlahStok) {
        this.idIkan = idIkan;
        this.namaIkan = namaIkan;
        this.jenisIkan = jenisIkan;
        this.jumlahStok = jumlahStok;
    }

    public String getIdIkan() {
        return idIkan;
    }

    public String getNamaIkan() {
        return namaIkan;
    }

    public String getJenisIkan() {
        return jenisIkan;
    }

    public int getJumlahStok() {
        return jumlahStok;
    }

    public void setIdIkan(String idIkan) {
        this.idIkan = idIkan;
    }

    public void setNamaIkan(String namaIkan) {
        this.namaIkan = namaIkan;
    }

    public void setJenisIkan(String jenisIkan) {
        this.jenisIkan = jenisIkan;
    }

    public void setJumlahStok(int jumlahStok) {
        this.jumlahStok = jumlahStok;
    }

    public void tampilkanDetail() {
        System.out.println("ID Ikan: " + idIkan);
        System.out.println("Nama Ikan: " + namaIkan);
        System.out.println("Jenis Ikan: " + jenisIkan);
        System.out.println("Jumlah Stok: " + jumlahStok + " kg");
    }
}


