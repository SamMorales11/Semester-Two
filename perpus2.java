package com;

public class perpus2 {

    // Mendefinisikan kelas buku dengan beberapa atribut yang mempresentasikan informasi buku
    private String judul; // atribut untuk menyimpan judul buku
    private String pengarang; // atribut untuk menyimpan nama pengarang buku
    private String penerbit; // atribut dari nama penerbit buku
    private String kategori; // atribut untuk menyatakan kategori buku

    // Konstruktor untuk kelas buku yang dapat menerima parameter judul, penulis dan juga penerbit
    public perpus2(String judul, String pengarang, String penerbit, String kategori) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.kategori = kategori;
    }

    // membuat method cetakBuku untuk menampilkan judul buku, nama pengarang dan juga penerbit buku
    public void cetakBuku() {
        System.out.println("............");
        System.out.println("Judul Buku : " + judul);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Diterbitkan Oleh : " + penerbit);
        System.out.println("Kategori : " + kategori);
        System.out.println("............");
    }

    public static void main(String[] args) {
        // membuat object buku 1
        perpus2 bukuSaya1 = new perpus2("Laskar Pelangi", "Andre Hirata", "Kompas Gramedia", "Novel");
        // membuat object buku 2
        perpus2 bukuSaya2 = new perpus2("The Wolf of Wall Street", "Jordan Belfort", "HODDER & STOUGHTON", "Biografi");
        // membuat object buku 3
        perpus2 bukuSaya3 = new perpus2("The Artemis", "Andy Weir", "Crown Publishing", "Fiksi Ilmiah");
        // membuat object buku 4
        perpus2 bukuSaya4 = new perpus2("Harry Potter", "J.K Rowling", "Gramedia Pustaka Utama", "Dongen");

        // memanggil method buku dengan mencetak buku 1, 2, 3 dan 4 dengan objek yang telah ditentukan
        bukuSaya1.cetakBuku();
        bukuSaya2.cetakBuku();
        bukuSaya3.cetakBuku();
        bukuSaya4.cetakBuku();
    }
}
