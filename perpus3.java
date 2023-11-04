package com;

public class perpus3 {

    private String judul;// menyatakan judul buku
    private String pengarang;// menyatakan pengarang buku tersebut
    private String penerbit;// menyatakan penerbit buku tersebut
    private String kategori;// menyatakan kategori buku tersebut

    public perpus3(String judul, String pengarang, String penerbit, String kategori) {
        this.judul = judul; 
        this.pengarang = pengarang; 
        this.penerbit = penerbit; 
        this.kategori = kategori; 
    }

    public String getJudul() {
        return judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public String getKategori() {
        return kategori;
    }

    public void cetakBuku() {
        System.out.println("Judul Buku : " + getJudul());
        System.out.println("Pengarang : " + getPengarang());
        System.out.println("Penerbit : " + getPenerbit());
        System.out.println("Kategori : " + getKategori());
        System.out.println();
    }

    public static void main(String[] args) {
        perpus3 bukuSaya1 = new perpus3("Laskar Pelangi", "Andrea Hirata", "Bentang Pustaka", "Novel");
        perpus3 bukuSaya2 = new perpus3("The Wolf of Wall Street", "Jordan Belfort", "Hodder & Stoughton", "Biografi");
        perpus3 bukuSaya3 = new perpus3("The Artemis", "Andy Weir", "Crown Publishing Group", "Fiksi Ilmiah");
        perpus3 bukuSaya4 = new perpus3("Harry Potter and the Philosopher's Stone", "J.K. Rowling", "Bloomsbury", "Dongeng");

        //memanggil bukuSaya dengan mencetak buku 1,2,3 dan 4
        bukuSaya1.cetakBuku();
        bukuSaya2.cetakBuku();
        bukuSaya3.cetakBuku();
        bukuSaya4.cetakBuku();
    }
}