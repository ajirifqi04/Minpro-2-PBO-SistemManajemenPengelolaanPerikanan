/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author AjiHowhow
 */
public class HasilPenangkapan {
    private String idIkan;
    private String idHasil;
    private String tanggal;
    private String kondisi;

    public HasilPenangkapan(String idIkan, String idHasil,
                            String tanggal, String kondisi) {

        this.idIkan = idIkan;
        this.idHasil = idHasil;
        this.tanggal = tanggal;
        this.kondisi = kondisi;
    }

    public String getIdIkan() {
        return idIkan;
    }

    public String getIdHasil() {
        return idHasil;
    }

    public String getTanggal() {
        return tanggal;
    }

    public String getKondisi() {
        return kondisi;
    }

    public void setIdIkan(String idIkan) {
        this.idIkan = idIkan;
    }

    public void setIdHasil(String idHasil) {
        this.idHasil = idHasil;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public void setKondisi(String kondisi) {
        this.kondisi = kondisi;
    }

    public void tampilkanDetail() {
        System.out.println("ID Ikan: " + idIkan);
        System.out.println("ID Hasil: " + idHasil);
        System.out.println("Tanggal: " + tanggal);
        System.out.println("Kondisi Hasil: " + kondisi);
    }
}
