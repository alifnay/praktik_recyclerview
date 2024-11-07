<h1 align="center">Praktikum RecyclerVview</h1>
<p align="center">Berisi kode aplikasi recycleview mata kuliah Pengembangan Aplikasi Mobile</p>

<div align="center">
    <img src="https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white">
    <img src="https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white">
    <img src="https://img.shields.io/badge/Gradle-02303A.svg?style=for-the-badge&logo=Gradle&logoColor=white">
</div>

## Anggota
1. Ataka Dzulfikar
2. Danendra Dipa Dananjaya
3. Alif Naywa Azzikra

## Struktur Kode
1. **Model Kelas**
   - `Chapter.java`: Mewakili data `Chapter` dengan atribut `id`, `chapterName`, dan `imageUrl`.
   - `Subject.java`: Mewakili data `Subject` dengan atribut `id`, `subjectName`, dan daftar `chapters`.

2. **Layout XML**
   - `activity_main.xml`: Layout utama yang berisi `RecyclerView` untuk menampilkan daftar `Subject`.
   - `single_chapter.xml`: Layout item untuk tiap `Chapter` dalam RecyclerView, menggunakan `CardView` dengan `ImageView` dan `TextView`.
   - `single_subject.xml`: Layout item untuk tiap `Subject` yang juga memuat RecyclerView untuk daftar `Chapter`.

3. **Dependencies**
   - Menambahkan pustaka **Picasso** untuk memuat gambar secara online.
   - `build.gradle.kts` dan `libs.version.toml` diatur dengan dependencies untuk RecyclerView, CardView, dan Picasso.

## Cara Menjalankan
1. Clone repositori ini:
   ```bash
   git clone https://github.com/alifnay/praktik_recyclerview.git

## Preview Application
<div align="center">
  <img src="https://github.com/user-attachments/assets/ba1e2dfa-e523-4a24-8194-0b7d66482b3f" height="500px">
</div>


