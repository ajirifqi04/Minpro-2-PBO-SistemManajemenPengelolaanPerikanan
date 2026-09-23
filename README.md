# Minpro 2 PBO - Sistem Informasi Pengelolaan Perikanan

## 1. Deskripsi Singkat Program

Program ini merupakan pengembangan dari Mini Project 1 berupa aplikasi berbasis console menggunakan Java untuk mengelola data perikanan. Data yang dikelola meliputi data ikan, lokasi penangkapan, dan hasil penangkapan.

Data lokasi penangkapan dan hasil penangkapan terhubung dengan data ikan melalui `idIkan`, sehingga setiap lokasi dan hasil penangkapan dapat diketahui terkait dengan ikan yang mana.

Program memiliki fitur tambah, tampil, ubah, dan hapus data perikanan. Pada program ini juga diterapkan konsep Pemrograman Berorientasi Objek seperti encapsulation, inheritance, dan polymorphism, serta menggunakan struktur MVC.

## 2. Penjelasan Alur Program

1. Program dimulai dari `Main.java`, kemudian program membuat objek `IkanController` dan `IkanView`.

2. Saat `IkanController` dibuat, program langsung mengisi dummy data awal ke dalam `ArrayList`, sehingga data sudah tersedia ketika program dijalankan.

3. Program menampilkan menu utama yang terdiri dari:
   - Tambah Data Perikanan
   - Tampilkan Data Perikanan
   - Ubah Data Perikanan
   - Hapus Data Perikanan
   - Keluar

4. Pada menu **Tambah Data Perikanan**, pengguna memasukkan data ikan berupa ID ikan, nama ikan, jenis ikan, dan jumlah stok.

5. Pengguna memilih habitat ikan, yaitu `Ikan Laut` atau `Ikan Air Tawar`.
   - Jika memilih `Ikan Laut`, pengguna memasukkan kedalaman habitat.
   - Jika memilih `Ikan Air Tawar`, pengguna memasukkan jenis perairan.

6. Setelah data ikan dibuat, pengguna memasukkan data lokasi penangkapan dan hasil penangkapan. Kedua data tersebut menggunakan `idIkan` yang sama dengan data ikan sehingga memiliki hubungan dengan ikan yang dimasukkan.

7. Pada menu **Tampilkan Data Perikanan**, program menampilkan data ikan beserta lokasi penangkapan dan hasil penangkapan yang memiliki `idIkan` yang sama.

8. Pada menu **Ubah Data Perikanan**, pengguna memasukkan `idIkan` untuk mencari data yang ingin diubah. Jika data ditemukan, pengguna dapat mengubah data ikan, lokasi penangkapan, dan hasil penangkapan yang terkait.

9. Pada menu **Hapus Data Perikanan**, pengguna memasukkan `idIkan`. Jika data ditemukan, data ikan beserta lokasi penangkapan dan hasil penangkapan yang memiliki `idIkan` yang sama akan dihapus.

10. Program terus berjalan sampai pengguna memilih menu **Keluar**.

## 3. Penjelasan Penerapan Encapsulation dan Inheritance

### Struktur Class

| Class | Package | Peran |
|---|---|---|
| `Ikan` | `model` | Superclass yang menyimpan data umum ikan |
| `IkanLaut` | `model` | Subclass dari `Ikan` untuk data ikan laut |
| `IkanAirTawar` | `model` | Subclass dari `Ikan` untuk data ikan air tawar |
| `LokasiPenangkapan` | `model` | Menyimpan data lokasi penangkapan |
| `HasilPenangkapan` | `model` | Menyimpan data hasil penangkapan |
| `IkanView` | `view` | Menampilkan menu dan menerima input pengguna |
| `IkanController` | `controller` | Mengatur proses pengolahan data |
| `Main` | `main` | Menjalankan program |

### Encapsulation

Encapsulation diterapkan dengan menggunakan access modifier `private` pada atribut yang terdapat di dalam class.

Contoh pada `model/Ikan.java`:

```java
private String idIkan;
private String namaIkan;
private String jenisIkan;
private int jumlahStok;
```

Atribut tersebut tidak dapat diakses secara langsung dari luar class. Untuk mengambil dan mengubah data digunakan method getter dan setter.

Contohnya:

```java
public String getIdIkan() {
    return idIkan;
}

public void setNamaIkan(String namaIkan) {
    this.namaIkan = namaIkan;
}
```

Penerapan encapsulation juga terdapat pada class `IkanLaut`, `IkanAirTawar`, `LokasiPenangkapan`, dan `HasilPenangkapan`.

### Inheritance

Inheritance diterapkan dengan menggunakan `Ikan` sebagai superclass dan `IkanLaut` serta `IkanAirTawar` sebagai subclass.

Struktur inheritance:

```text
Ikan
├── IkanLaut
└── IkanAirTawar
```

Pada `model/IkanLaut.java`, inheritance diterapkan menggunakan `extends`:

```java
public class IkanLaut extends Ikan {
    private int kedalamanHabitat;
}
```

Sedangkan `IkanAirTawar` juga mewarisi class `Ikan`:

```java
public class IkanAirTawar extends Ikan {
    private String jenisPerairan;
}
```

Kedua subclass tersebut mewarisi atribut dan method dari `Ikan`, kemudian memiliki atribut tambahan masing-masing. `IkanLaut` memiliki `kedalamanHabitat`, sedangkan `IkanAirTawar` memiliki `jenisPerairan`.

## 4. Penjelasan Letak Penerapan Nilai Tambah

### Struktur MVC (Model-View-Controller)

Program menggunakan struktur MVC dengan membagi class ke dalam beberapa package.

Struktur package yang digunakan pada project adalah:

```text
Source Packages
├── controller
│   └── IkanController.java
├── main
│   └── Main.java
├── model
│   ├── HasilPenangkapan.java
│   ├── Ikan.java
│   ├── IkanAirTawar.java
│   ├── IkanLaut.java
│   └── LokasiPenangkapan.java
└── view
    └── IkanView.java
```

- **Model** digunakan untuk menyimpan class yang berhubungan dengan data program, yaitu `Ikan`, `IkanLaut`, `IkanAirTawar`, `LokasiPenangkapan`, dan `HasilPenangkapan`.
- **View** digunakan untuk menampilkan menu dan menerima input dari pengguna melalui `IkanView`.
- **Controller** digunakan untuk mengatur proses pengolahan data melalui `IkanController`, seperti menambah, mencari, mengubah, dan menghapus data.
- **Main** digunakan untuk menjalankan program melalui `Main.java`.

### Polymorphism - Method Overriding

Polymorphism diterapkan menggunakan method overriding pada method `tampilkanDetail()`.

Method `tampilkanDetail()` yang terdapat pada class `Ikan` dioverride pada class `IkanLaut` dan `IkanAirTawar`.

Contoh pada `model/IkanLaut.java`:

```java
@Override
public void tampilkanDetail() {
    System.out.println("ID Ikan: " + getIdIkan());
    System.out.println("Nama Ikan: " + getNamaIkan());
    System.out.println("Jenis Ikan: " + getJenisIkan());
    System.out.println("Jumlah Stok: " + getJumlahStok() + " kg");
    System.out.println("Kedalaman Habitat: " + kedalamanHabitat + " meter");
}
```

Sedangkan pada `IkanAirTawar`, method yang sama digunakan untuk menampilkan informasi tambahan berupa `jenisPerairan`.

Dengan overriding tersebut, method `tampilkanDetail()` dapat memberikan tampilan yang berbeda sesuai dengan jenis objek yang digunakan.

### Dummy Data Awal

Dummy data awal diterapkan pada `controller/IkanController.java`.

Saat `IkanController` dibuat, program langsung memasukkan data awal ke dalam `ArrayList`, yaitu data ikan, lokasi penangkapan, dan hasil penangkapan.

Contohnya:

```java
daftarIkan.add(
    new IkanLaut(
        "IK001",
        "Ikan Tuna",
        "Konsumsi",
        50,
        100
    )
);
```

Dengan adanya dummy data tersebut, pengguna dapat langsung melihat data ketika menjalankan fitur tampil data tanpa harus memasukkan data terlebih dahulu.

### Validasi Input

Validasi input diterapkan pada bagian input di `view/IkanView.java`.

Validasi digunakan untuk memastikan input yang dimasukkan sesuai dengan kebutuhan program. Jika input tidak sesuai, pengguna akan diminta untuk memasukkan kembali data tersebut.

Validasi diterapkan pada beberapa input seperti ID, nama ikan, jenis ikan, jumlah stok, habitat, kedalaman habitat, dan jenis perairan.

### Screenshot Output Sistem

Berikut merupakan beberapa screenshot saat program dijalankan.

#### Menu Utama

<img width="421" height="179" alt="image" src="https://github.com/user-attachments/assets/9853053a-c085-4486-9d11-e78188ea4313" />

#### Tambah Data Perikanan

<img width="504" height="858" alt="image" src="https://github.com/user-attachments/assets/42d3d562-8232-4797-8842-ee9900585cba" />

#### Tampilkan Data Perikanan

<img width="307" height="890" alt="image" src="https://github.com/user-attachments/assets/2a5626f7-4fc8-4284-93cf-a946493fb5ff" />

#### Ubah Data Perikanan

<img width="409" height="857" alt="image" src="https://github.com/user-attachments/assets/cbad331d-f4ba-4c3c-a5fb-87763aa054d3" />

#### Hapus Data Perikanan

<img width="325" height="753" alt="image" src="https://github.com/user-attachments/assets/5eeb5c1e-3fb8-4bc6-8241-d775d2dbf410" />

