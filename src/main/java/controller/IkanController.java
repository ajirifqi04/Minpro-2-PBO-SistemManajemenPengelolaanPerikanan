/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.Ikan;
import model.IkanLaut;
import model.LokasiPenangkapan;
import model.HasilPenangkapan;

/**
 *
 * @author AjiHowhow
 */
public class IkanController {
    private ArrayList<Ikan> daftarIkan;
    private ArrayList<LokasiPenangkapan> daftarLokasi;
    private ArrayList<HasilPenangkapan> daftarHasil;

    public IkanController() {

        daftarIkan = new ArrayList<>();
        daftarLokasi = new ArrayList<>();
        daftarHasil = new ArrayList<>();

        daftarIkan.add(
            new IkanLaut(
                "IK001",
                "Ikan Tuna",
                "Konsumsi",
                50,
                100
            )
        );

        daftarLokasi.add(
            new LokasiPenangkapan(
                "IK001",
                "LK001",
                "Laut Samarinda",
                "Kalimantan Timur"
            )
        );

        daftarHasil.add(
            new HasilPenangkapan(
                "IK001",
                "HP001",
                "20-09-2026",
                "Hasil baik"
            )
        );
    }

    public ArrayList<Ikan> getDaftarIkan() {
        return daftarIkan;
    }

    public ArrayList<LokasiPenangkapan> getDaftarLokasi() {
        return daftarLokasi;
    }

    public ArrayList<HasilPenangkapan> getDaftarHasil() {
        return daftarHasil;
    }

    public void tambahIkan(Ikan ikan) {
        daftarIkan.add(ikan);
    }

    public void tambahLokasi(LokasiPenangkapan lokasi) {
        daftarLokasi.add(lokasi);
    }

    public void tambahHasil(HasilPenangkapan hasil) {
        daftarHasil.add(hasil);
    }

    public Ikan cariIkan(String idIkan) {

        for (Ikan ikan : daftarIkan) {

            if (ikan.getIdIkan().equals(idIkan)) {
                return ikan;
            }
        }

        return null;
    }

    public LokasiPenangkapan cariLokasi(String idIkan) {

        for (LokasiPenangkapan lokasi : daftarLokasi) {

            if (lokasi.getIdIkan().equals(idIkan)) {
                return lokasi;
            }
        }

        return null;
    }

    public HasilPenangkapan cariHasil(String idIkan) {

        for (HasilPenangkapan hasil : daftarHasil) {

            if (hasil.getIdIkan().equals(idIkan)) {
                return hasil;
            }
        }

        return null;
    }

    public void hapusIkan(String idIkan) {

        Ikan ikan = cariIkan(idIkan);

        if (ikan != null) {
            daftarIkan.remove(ikan);
        }

        LokasiPenangkapan lokasi = cariLokasi(idIkan);

        if (lokasi != null) {
            daftarLokasi.remove(lokasi);
        }

        HasilPenangkapan hasil = cariHasil(idIkan);

        if (hasil != null) {
            daftarHasil.remove(hasil);
        }
    }
}
