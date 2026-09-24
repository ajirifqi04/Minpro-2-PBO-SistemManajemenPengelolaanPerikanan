# Minpro 2 PBO - Sistem Manajemen Pengelolaan Perikanan

Nama : Aji Rifqi Suryana 

NIM : 2509116054

## 1. Deskripsi Singkat Program

Program ini merupakan pengembangan dari Mini Project 1 berupa aplikasi berbasis console menggunakan Java untuk mengelola data perikanan. Data yang dikelola meliputi data ikan, lokasi penangkapan, dan hasil penangkapan.

Data lokasi penangkapan dan hasil penangkapan terhubung dengan data ikan melalui `idIkan`, sehingga setiap lokasi dan hasil penangkapan dapat diketahui terkait dengan ikan yang mana.

Program memiliki fitur tambah, tampil, ubah, dan hapus data perikanan. Pada program ini juga diterapkan konsep Pemrograman Berorientasi Objek seperti encapsulation, inheritance, dan polymorphism, serta menggunakan struktur MVC.

## 2. Penjelasan Alur Program

Program dimulai dari `Main.java` dengan membuat objek `IkanController` dan `IkanView`. Setelah itu, `IkanController` menyiapkan `ArrayList` dan memasukkan satu data dummy sebagai data awal. Program kemudian menampilkan menu utama yang terdiri dari tambah data, tampilkan data, ubah data, hapus data, dan keluar.

1. **Tambah Data Perikanan**  
   Pengguna memilih menu tambah data, kemudian memasukkan data ikan seperti ID ikan, nama ikan, jenis ikan, jumlah stok, dan habitat. Jika memilih ikan laut, pengguna memasukkan kedalaman habitat, sedangkan jika memilih ikan air tawar, pengguna memasukkan jenis perairan. Setelah itu, pengguna memasukkan data lokasi penangkapan dan hasil penangkapan. Data lokasi dan hasil penangkapan menggunakan `idIkan` yang sama agar terhubung dengan data ikan.

2. **Tampilkan Data Perikanan**  
   Pengguna memilih menu tampilkan data. Program mengambil data dari `ArrayList`, kemudian menampilkan data ikan beserta lokasi penangkapan dan hasil penangkapan yang memiliki `idIkan` yang sama.

3. **Ubah Data Perikanan**  
   Pengguna memilih menu ubah data dan memasukkan `idIkan` yang ingin diubah. Program mencari data berdasarkan ID tersebut. Jika data ditemukan, pengguna dapat mengubah data ikan, lokasi penangkapan, dan hasil penangkapan yang terkait dengan ID tersebut.

4. **Hapus Data Perikanan**  
   Pengguna memilih menu hapus data dan memasukkan `idIkan` yang ingin dihapus. Program mencari data berdasarkan ID tersebut. Jika ditemukan, data ikan beserta lokasi penangkapan dan hasil penangkapan yang memiliki `idIkan` yang sama akan dihapus.

5. **Keluar**  
   Jika pengguna memilih menu keluar, perulangan menu dihentikan dan program selesai dijalankan.

Selama proses input, program melakukan validasi untuk memastikan data yang dimasukkan sesuai dengan ketentuan. Jika input tidak sesuai, pengguna akan diminta memasukkan kembali data tersebut.

## 3. Penjelasan Penerapan Encapsulation, Inheritance, Dummy Data, Validasi Input

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

<p align="center">
<img width="349" height="145" alt="image" src="https://github.com/user-attachments/assets/a14f4594-740c-4790-8f20-9e1e6151b122" />

Atribut tersebut tidak dapat diakses secara langsung dari luar class. Untuk mengambil dan mengubah data digunakan method getter dan setter.

Contohnya:

<p align="center">
<img width="343" height="87" alt="image" src="https://github.com/user-attachments/assets/1d93ea8d-852a-45a6-9d08-ffd3a92fb4d0" />

<p align="center">
<img width="533" height="83" alt="image" src="https://github.com/user-attachments/assets/e7e75ff0-7eb7-4adf-a9a1-867ee440e315" />


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

<p align="center">
<img width="430" height="60" alt="image" src="https://github.com/user-attachments/assets/df442a2b-5452-419a-9907-efa1c8c8b100" />

Sedangkan `IkanAirTawar` juga mewarisi class `Ikan`:

<p align="center">
<img width="500" height="62" alt="image" src="https://github.com/user-attachments/assets/b968a653-98aa-4d21-91b9-60708272b265" />

Kedua subclass tersebut mewarisi atribut dan method dari `Ikan`, kemudian memiliki atribut tambahan masing-masing. `IkanLaut` memiliki `kedalamanHabitat`, sedangkan `IkanAirTawar` memiliki `jenisPerairan`.

### Dummy Data Awal

Dummy data awal diterapkan pada `controller/IkanController.java`.

Saat `IkanController` dibuat, program langsung memasukkan data awal ke dalam `ArrayList`, yaitu data ikan, lokasi penangkapan, dan hasil penangkapan.

Contohnya:

<p align="center">
<img width="253" height="243" alt="image" src="https://github.com/user-attachments/assets/411b6884-4c99-4284-b78a-4d18544bfc04" />

Dengan adanya dummy data tersebut, pengguna dapat langsung melihat data ketika menjalankan fitur tampil data tanpa harus memasukkan data terlebih dahulu.

### Validasi Input

Validasi input diterapkan pada bagian input di `view/IkanView.java`.

Validasi digunakan untuk memastikan input yang dimasukkan sesuai dengan kebutuhan program. Jika input tidak sesuai, pengguna akan diminta untuk memasukkan kembali data tersebut.

Validasi diterapkan pada beberapa input seperti ID, nama ikan, jenis ikan, jumlah stok, habitat, kedalaman habitat, dan jenis perairan.

Contohnya :

<p align="center">
<img width="383" height="192" alt="image" src="https://github.com/user-attachments/assets/7e8968b9-b466-4b9d-a3b0-77db7d9e803c" />

## 4. Penjelasan Letak Penerapan Nilai Tambah

### Struktur MVC (Model-View-Controller)

Program menggunakan struktur MVC dengan membagi class ke dalam beberapa package.

Struktur package yang digunakan pada project adalah:

<p align="center">
<img width="340" height="350" alt="image" src="https://github.com/user-attachments/assets/543edb01-637f-438a-a85b-9e3e0f52c407" />

- **Model** digunakan untuk menyimpan class yang berhubungan dengan data program, yaitu `Ikan`, `IkanLaut`, `IkanAirTawar`, `LokasiPenangkapan`, dan `HasilPenangkapan`.
- **View** digunakan untuk menampilkan menu dan menerima input dari pengguna melalui `IkanView`.
- **Controller** digunakan untuk mengatur proses pengolahan data melalui `IkanController`, seperti menambah, mencari, mengubah, dan menghapus data.
- **Main** digunakan untuk menjalankan program melalui `Main.java`.

### Polymorphism - Method Overriding

Polymorphism diterapkan menggunakan method overriding pada method `tampilkanDetail()`.

Method `tampilkanDetail()` yang terdapat pada class `Ikan` dioverride pada class `IkanLaut` dan `IkanAirTawar`.

Contoh pada `model/IkanLaut.java`:

<p align="center">
<img width="925" height="233" alt="image" src="https://github.com/user-attachments/assets/22a1f9ff-1c1b-41a4-8ef2-0804c947774c" />

Sedangkan pada `IkanAirTawar`, method yang sama digunakan untuk menampilkan informasi tambahan berupa `jenisPerairan`.

Dengan overriding tersebut, method `tampilkanDetail()` dapat memberikan tampilan yang berbeda sesuai dengan jenis objek yang digunakan.

### Screenshot Output Sistem

Berikut merupakan beberapa screenshot saat program dijalankan.

#### Menu Utama

<p align="center">
<img width="421" height="179" alt="image" src="https://github.com/user-attachments/assets/9853053a-c085-4486-9d11-e78188ea4313" />

#### Tambah Data Perikanan

<p align="center">
<img width="504" height="858" alt="image" src="https://github.com/user-attachments/assets/42d3d562-8232-4797-8842-ee9900585cba" />

#### Tampilkan Data Perikanan

<p align="center">
<img width="307" height="890" alt="image" src="https://github.com/user-attachments/assets/2a5626f7-4fc8-4284-93cf-a946493fb5ff" />

#### Ubah Data Perikanan

<p align="center">
<img width="409" height="857" alt="image" src="https://github.com/user-attachments/assets/cbad331d-f4ba-4c3c-a5fb-87763aa054d3" />

#### Hapus Data Perikanan

<p align="center">
<img width="325" height="753" alt="image" src="https://github.com/user-attachments/assets/5eeb5c1e-3fb8-4bc6-8241-d775d2dbf410" />

