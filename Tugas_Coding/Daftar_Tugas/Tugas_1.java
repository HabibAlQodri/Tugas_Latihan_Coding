// 1. Buatlah perulangan hingga 100 menggunakan Java dengan output sebagai berikut:
//    1
//    2
//    3
//    4
//    5
//    6
//    7
//    8
//    9
//    (Your Name)
//    (Your Name)
//    (Your Name)

public class Tugas_1 {
    public static void main(String[] args) {
        // Code di atas adalah dasar yang diperlukan dalam pemograman java.

        String nama = "habib Al qodri";
        // Code di atas adalah tipe data String yang digunakan untuk data jenis kalimat.

        int angka;
        int name;
        // Selanjutnya adalah tipe data Integer(int).
        // Digunakan untuk tipe data yang berupa angka, untuk diolah dalam berbagai metode.

            for (angka = 1; angka < 10; angka++){
                System.out.println(angka);
            }
            // Setelah itu melakukan perulangan(looping) "for" untuk menjalankan program tersebut.
            // Batasannya adalah jika angka tersebut adalah 1 dan kurang dari 10, maka akan menulis angka tersebut.

            for (name = angka; name <= 100; name++) {
                System.out.println(nama);
            }
        // dan jika program tersebut dijalankan lagi dan data tersebut dibatasi mulai dari perulangan "angka",
        // dan dijalankan hingga sampai kurang dari sama dengan 100,
        // maka program tersebut akan melanjutakan perulangan lagi mulai dari 10 melanjutkan perulangan "angka",
        // lalu akan menuliskan nama untuk melanjutkan perulangan "angka" sampai data tersebut kurang dari sama dengan 100.


        System.out.println("");
        System.out.println("Program berhasil dijalankan");
    }
}