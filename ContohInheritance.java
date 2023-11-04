package com;

// Kelas utama (superclass)
class Kendaraan {
    String jenis;

    public Kendaraan(String jenis) {
        this.jenis = jenis;
    }

    public void tampilkanJenis() {
        System.out.println("Jenis kendaraan: " + jenis);
    }
}

// Kelas turunan (subclass) dari Kendaraan
class Mobil extends Kendaraan {
    String merek;

    public Mobil(String jenis, String merek) {
        super(jenis);
        this.merek = merek;
    }

    public void tampilkanMerek() {
        System.out.println("Merek mobil: " + merek);
    }
}

// Kelas utama yang berisi method main()
public class ContohInheritance {
    public static void main(String[] args) {
        Mobil avanza = new Mobil("Mobil Penumpang", "Toyota Avanza");
        avanza.tampilkanJenis(); // Memanggil method dari superclass
        avanza.tampilkanMerek(); // Memanggil method dari subclass
    }
}
