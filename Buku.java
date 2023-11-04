package com;

public class Buku {

    //Mendefinisikan kelas buku dengan beberapa atribut yang mempresentasikan informasi buku
    private String Judul; // atribut untuk menyimpan judul buku
    private String Pengarang; // atribut untuk menyimpan nama pengarang buku
    private String Penerbit; // atribut dari nama penerbit buku
    private String Kategori; // atribut untuk menyatakan kategori buku

    //Konstruktor untuk kelas buku yang dapat menerima parameter judul,penulis dan juga penerbit
    public Buku (String Judul,String Pengarang,String Penerbit,String Kategori){
        this.Judul = Judul;
        this.Pengarang = Pengarang;
        this.Penerbit = Penerbit;
        this.Kategori = Kategori;
    }

    //membuat method cetak buku untuk menampilkan judul buku,nama pengarang dan juga penerbit buku
    public void cetakBuku (){
        System.out.println("............");
        System.out.println("Judul Buku : " + Judul);
        System.out.println("Pengarang : " + Pengarang);
        System.out.println("Diterbitkan Oleh : " + Penerbit);
        System.out.println("Kategori : " + Kategori);
        System.out.println("............");
    }
        public static void main(String[] args){
            //membuat object buku 1
Buku bukuSaya1 = new Buku("Laskar Pelangi","Andre Hirata","Kompas Gramedia","Novel");
            //membuat object buku 2
Buku bukuSaya2 = new Buku("The Wolf of Wall Street","Jordan Belfort","HODDER & STOUGHTON","Biografi");
            //membuat object buku 3
Buku bukuSaya3 = new Buku("The Artemis","Andy Weir","Crown Publishing","Fiksi Ilmiah");
            //membuat object buku 4
Buku bukuSaya4 = new Buku("Harry Potter","J.K Rowling","Gramedia Pustaka Utama","Dongen");

            //memanggil method buku dengan mencetak buku 1,2,3 dan 4 dengan objek yang telah ditentukan
            bukuSaya1.cetakBuku();
            bukuSaya2.cetakBuku();
            bukuSaya3.cetakBuku();
            bukuSaya4.cetakBuku();
        }
            
}