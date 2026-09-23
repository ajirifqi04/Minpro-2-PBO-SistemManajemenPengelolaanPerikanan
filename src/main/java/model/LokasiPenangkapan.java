/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author AjiHowhow
 */
public class LokasiPenangkapan {
     private String idIkan;
    private String idLokasi;
    private String namaLokasi;
    private String wilayah;

    public LokasiPenangkapan(String idIkan, String idLokasi,
                             String namaLokasi, String wilayah) {

        this.idIkan = idIkan;
        this.idLokasi = idLokasi;
        this.namaLokasi = namaLokasi;
        this.wilayah = wilayah;
    }

    public String getIdIkan() {
        return idIkan;
    }

    public String getIdLokasi() {
        return idLokasi;
    }

    public String getNamaLokasi() {
        return namaLokasi;
    }

    public String getWilayah() {
        return wilayah;
    }

    public void setIdIkan(String idIkan) {
        this.idIkan = idIkan;
    }

    public void setIdLokasi(String idLokasi) {
        this.idLokasi = idLokasi;
    }

    public void setNamaLokasi(String namaLokasi) {
        this.namaLokasi = namaLokasi;
    }

    public void setWilayah(String wilayah) {
        this.wilayah = wilayah;
    }

    public void tampilkanDetail() {
        System.out.println("ID Ikan: " + idIkan);
        System.out.println("ID Lokasi: " + idLokasi);
        System.out.println("Nama Lokasi: " + namaLokasi);
        System.out.println("Wilayah: " + wilayah);
    }
}
