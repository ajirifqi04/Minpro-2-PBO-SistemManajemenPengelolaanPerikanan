/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;


import java.util.ArrayList;
import java.util.Scanner;
import model.Ikan;
import model.IkanLaut;
import model.IkanAirTawar;
import model.LokasiPenangkapan;
import model.HasilPenangkapan;

/**
 *
 * @author AjiHowhow
 */
public class IkanView {
    private Scanner input;

    public IkanView() {
        input = new Scanner(System.in);
    }

    public int menu() {

        int pilihan = 0;

        while (pilihan < 1 || pilihan > 5) {

            System.out.println();
            System.out.println("=== SISTEM PENGELOLAAN PERIKANAN ===");
            System.out.println("1. Tambah Data Perikanan");
            System.out.println("2. Tampilkan Data Perikanan");
            System.out.println("3. Ubah Data Perikanan");
            System.out.println("4. Hapus Data Perikanan");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");

            if (input.hasNextInt()) {

                pilihan = input.nextInt();
                input.nextLine();

                if (pilihan < 1 || pilihan > 5) {
                    System.out.println("Pilihan tidak tersedia.");
                }

            } else {

                input.nextLine();
                System.out.println("Pilihan harus berupa angka.");
            }
        }

        return pilihan;
    }

    public Ikan inputIkan() {

        System.out.println();
        System.out.println("=== DATA IKAN ===");

        String idIkan = inputId();
        String namaIkan = inputNama();
        String jenisIkan = inputJenis();
        int jumlahStok = inputStok();

        int pilihanHabitat = 0;

        while (pilihanHabitat < 1 || pilihanHabitat > 2) {

            System.out.println();
            System.out.println("Habitat Ikan:");
            System.out.println("1. Ikan Laut");
            System.out.println("2. Ikan Air Tawar");
            System.out.print("Pilihan: ");

            if (input.hasNextInt()) {

                pilihanHabitat = input.nextInt();
                input.nextLine();

                if (pilihanHabitat < 1 || pilihanHabitat > 2) {
                    System.out.println("Pilihan tidak tersedia.");
                }

            } else {

                input.nextLine();
                System.out.println("Pilihan harus berupa angka.");
            }
        }

        if (pilihanHabitat == 1) {

            int kedalaman = inputKedalaman();

            return new IkanLaut(
                idIkan,
                namaIkan,
                jenisIkan,
                jumlahStok,
                kedalaman
            );

        } else {

            String jenisPerairan = inputJenisPerairan();

            return new IkanAirTawar(
                idIkan,
                namaIkan,
                jenisIkan,
                jumlahStok,
                jenisPerairan
            );
        }
    }

    public String inputId() {

        String idIkan = "";

        while (idIkan.length() == 0) {

            System.out.print("ID Ikan (contoh: IK002): ");
            idIkan = input.nextLine();

            if (idIkan.length() == 0) {
                System.out.println("ID tidak boleh kosong.");
            }
        }

        return idIkan;
    }

    public String inputNama() {

        String namaIkan = "";

        while (namaIkan.length() == 0) {

            System.out.print("Nama Ikan (contoh: Ikan Nila): ");
            namaIkan = input.nextLine();

            if (namaIkan.length() == 0) {
                System.out.println("Nama tidak boleh kosong.");
            }
        }

        return namaIkan;
    }

    public String inputJenis() {

        int pilihan = 0;

        while (pilihan < 1 || pilihan > 2) {

            System.out.println("Jenis Ikan:");
            System.out.println("1. Konsumsi");
            System.out.println("2. Budidaya");
            System.out.print("Pilihan: ");

            if (input.hasNextInt()) {

                pilihan = input.nextInt();
                input.nextLine();

                if (pilihan < 1 || pilihan > 2) {
                    System.out.println("Pilihan tidak tersedia.");
                }

            } else {

                input.nextLine();
                System.out.println("Pilihan harus berupa angka.");
            }
        }

        if (pilihan == 1) {
            return "Konsumsi";
        } else {
            return "Budidaya";
        }
    }

    public int inputStok() {

        int stok = 0;

        while (stok <= 0) {

            System.out.print("Jumlah Stok (kg) (contoh: 30): ");

            if (input.hasNextInt()) {

                stok = input.nextInt();
                input.nextLine();

                if (stok <= 0) {
                    System.out.println("Stok harus lebih dari 0.");
                }

            } else {

                input.nextLine();
                System.out.println("Stok harus berupa angka.");
            }
        }

        return stok;
    }

    public int inputKedalaman() {

        int kedalaman = 0;

        while (kedalaman <= 0) {

            System.out.print(
                "Kedalaman Habitat (meter) (contoh: 100): "
            );

            if (input.hasNextInt()) {

                kedalaman = input.nextInt();
                input.nextLine();

                if (kedalaman <= 0) {
                    System.out.println(
                        "Kedalaman harus lebih dari 0."
                    );
                }

            } else {

                input.nextLine();
                System.out.println(
                    "Kedalaman harus berupa angka."
                );
            }
        }

        return kedalaman;
    }

    public String inputJenisPerairan() {

        int pilihan = 0;

        while (pilihan < 1 || pilihan > 3) {

            System.out.println("Jenis Perairan:");
            System.out.println("1. Sungai");
            System.out.println("2. Danau");
            System.out.println("3. Waduk");
            System.out.print("Pilihan: ");

            if (input.hasNextInt()) {

                pilihan = input.nextInt();
                input.nextLine();

                if (pilihan < 1 || pilihan > 3) {
                    System.out.println("Pilihan tidak tersedia.");
                }

            } else {

                input.nextLine();
                System.out.println(
                    "Pilihan harus berupa angka."
                );
            }
        }

        if (pilihan == 1) {
            return "Sungai";
        } else if (pilihan == 2) {
            return "Danau";
        } else {
            return "Waduk";
        }
    }

    public LokasiPenangkapan inputLokasi(String idIkan) {

        System.out.println();
        System.out.println("=== LOKASI PENANGKAPAN ===");

        String idLokasi = inputIdLokasi();
        String namaLokasi = inputNamaLokasi();
        String wilayah = inputWilayah();

        return new LokasiPenangkapan(
            idIkan,
            idLokasi,
            namaLokasi,
            wilayah
        );
    }

    public String inputIdLokasi() {

        String idLokasi = "";

        while (idLokasi.length() == 0) {

            System.out.print("ID Lokasi (contoh: LK002): ");
            idLokasi = input.nextLine();

            if (idLokasi.length() == 0) {
                System.out.println("ID tidak boleh kosong.");
            }
        }

        return idLokasi;
    }

    public String inputNamaLokasi() {

        String namaLokasi = "";

        while (namaLokasi.length() == 0) {

            System.out.print(
                "Nama Lokasi (contoh: Sungai Mahakam): "
            );

            namaLokasi = input.nextLine();

            if (namaLokasi.length() == 0) {
                System.out.println(
                    "Nama lokasi tidak boleh kosong."
                );
            }
        }

        return namaLokasi;
    }

    public String inputWilayah() {

        String wilayah = "";

        while (wilayah.length() == 0) {

            System.out.print("Wilayah (contoh: Samarinda): ");
            wilayah = input.nextLine();

            if (wilayah.length() == 0) {
                System.out.println(
                    "Wilayah tidak boleh kosong."
                );
            }
        }

        return wilayah;
    }

    public HasilPenangkapan inputHasil(String idIkan) {

        System.out.println();
        System.out.println("=== HASIL PENANGKAPAN ===");

        String idHasil = inputIdHasil();
        String tanggal = inputTanggal();
        String kondisi = inputKondisi();

        return new HasilPenangkapan(
            idIkan,
            idHasil,
            tanggal,
            kondisi
        );
    }

    public String inputIdHasil() {

        String idHasil = "";

        while (idHasil.length() == 0) {

            System.out.print("ID Hasil (contoh: HP002): ");
            idHasil = input.nextLine();

            if (idHasil.length() == 0) {
                System.out.println("ID tidak boleh kosong.");
            }
        }

        return idHasil;
    }

    public String inputTanggal() {

        String tanggal = "";

        while (tanggal.length() == 0) {

            System.out.print(
                "Tanggal (contoh: 21-09-2026): "
            );

            tanggal = input.nextLine();

            if (tanggal.length() == 0) {
                System.out.println(
                    "Tanggal tidak boleh kosong."
                );
            }
        }

        return tanggal;
    }

    public String inputKondisi() {

        String kondisi = "";

        while (kondisi.length() == 0) {

            System.out.print(
                "Kondisi Hasil (contoh: Hasil baik): "
            );

            kondisi = input.nextLine();

            if (kondisi.length() == 0) {
                System.out.println(
                    "Kondisi hasil tidak boleh kosong."
                );
            }
        }

        return kondisi;
    }

    public void tampilkanSemua(
            ArrayList<Ikan> daftarIkan,
            ArrayList<LokasiPenangkapan> daftarLokasi,
            ArrayList<HasilPenangkapan> daftarHasil) {

        System.out.println();
        System.out.println("=== DATA PERIKANAN ===");

        if (daftarIkan.size() == 0) {

            System.out.println("Belum ada data perikanan.");

        } else {

            for (Ikan ikan : daftarIkan) {

                System.out.println();
                System.out.println("-------------------------");

                ikan.tampilkanDetail();

                System.out.println();
                System.out.println("--- Lokasi Penangkapan ---");

                for (LokasiPenangkapan lokasi : daftarLokasi) {

                    if (lokasi.getIdIkan().equals(ikan.getIdIkan())) {
                        lokasi.tampilkanDetail();
                    }
                }

                System.out.println();
                System.out.println("--- Hasil Penangkapan ---");

                for (HasilPenangkapan hasil : daftarHasil) {

                    if (hasil.getIdIkan().equals(ikan.getIdIkan())) {
                        hasil.tampilkanDetail();
                    }
                }

                System.out.println("-------------------------");
            }
        }
    }
}
