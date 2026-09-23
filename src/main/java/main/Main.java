/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import controller.IkanController;
import model.Ikan;
import model.LokasiPenangkapan;
import model.HasilPenangkapan;
import view.IkanView;

/**
 *
 * @author AjiHowhow
 */
public class Main {

    public static void main(String[] args) {
        IkanController controller = new IkanController();
        IkanView view = new IkanView();

        int pilihan = 0;

        while (pilihan != 5) {

            pilihan = view.menu();

            if (pilihan == 1) {

                System.out.println();
                System.out.println("=== TAMBAH DATA PERIKANAN ===");

                Ikan ikan = view.inputIkan();

                controller.tambahIkan(ikan);

                LokasiPenangkapan lokasi =
                        view.inputLokasi(ikan.getIdIkan());

                controller.tambahLokasi(lokasi);

                HasilPenangkapan hasil =
                        view.inputHasil(ikan.getIdIkan());

                controller.tambahHasil(hasil);

                System.out.println();
                System.out.println(
                    "Data perikanan berhasil ditambahkan."
                );

            } else if (pilihan == 2) {

                view.tampilkanSemua(
                    controller.getDaftarIkan(),
                    controller.getDaftarLokasi(),
                    controller.getDaftarHasil()
                );

            } else if (pilihan == 3) {

                System.out.println();
                System.out.println("=== UBAH DATA PERIKANAN ===");

                String idIkan = view.inputId();

                Ikan ikan = controller.cariIkan(idIkan);

                if (ikan != null) {

                    String namaIkan = view.inputNama();
                    String jenisIkan = view.inputJenis();
                    int jumlahStok = view.inputStok();

                    ikan.setNamaIkan(namaIkan);
                    ikan.setJenisIkan(jenisIkan);
                    ikan.setJumlahStok(jumlahStok);

                    LokasiPenangkapan lokasi =
                            controller.cariLokasi(idIkan);

                    if (lokasi != null) {

                        String namaLokasi =
                                view.inputNamaLokasi();

                        String wilayah =
                                view.inputWilayah();

                        lokasi.setNamaLokasi(namaLokasi);
                        lokasi.setWilayah(wilayah);
                    }

                    HasilPenangkapan hasil =
                            controller.cariHasil(idIkan);

                    if (hasil != null) {

                        String tanggal =
                                view.inputTanggal();

                        String kondisi =
                                view.inputKondisi();

                        hasil.setTanggal(tanggal);
                        hasil.setKondisi(kondisi);
                    }

                    System.out.println();
                    System.out.println(
                        "Data perikanan berhasil diubah."
                    );

                } else {

                    System.out.println(
                        "Data ikan tidak ditemukan."
                    );
                }

            } else if (pilihan == 4) {

                System.out.println();
                System.out.println("=== HAPUS DATA PERIKANAN ===");

                String idIkan = view.inputId();

                Ikan ikan = controller.cariIkan(idIkan);

                if (ikan != null) {

                    controller.hapusIkan(idIkan);

                    System.out.println(
                        "Data perikanan berhasil dihapus."
                    );

                } else {

                    System.out.println(
                        "Data ikan tidak ditemukan."
                    );
                }
            }
        }

        System.out.println();
        System.out.println("Program selesai.");
    }
}
