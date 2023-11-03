// 4. Buatlah sebuah variabel dengan tipe data array,
// kemudian tampilkan semua nilai dalam variabel tersebut menggunakan perulangan for.

import java.util.Scanner;
public class Tugas_4 {
    public static void main(String[] args) {

        String [] Makanan = {"Mie Ayam", "Bakso", "Sate Ayam", "Ayam Geprek", "Soto Ayam", "sup sayur"};
        String [] Minuman = {"Air Mineral", "Es Teh", "Kopi", "Jus jeruk", "Es Krim"};
        // Berikut adalah contoh data jenis array 1 dimensi.

        Scanner Keyboard = new Scanner(System.in);
        double harga;
        // Selanjutnya kita buat Scanner untuk input yang akan dimasukan.

        try {
            System.out.println("Pilih harga 5.000 atau 10.000");
            harga = Keyboard.nextDouble();

            for (harga = 5.000; ; ) {
                System.out.println("List Makanan seharga 5.000 adalah " + Makanan[5] + ", " + Makanan[4] + ".");
                System.out.println("List Minuman seharga 5.000 adalah " + Minuman[0] + ", " + Minuman[1] + ".");
                break;
            }
            for (harga = 10.000; ; ) {
                System.out.println("List makanan seharga 10.000 adalah " + Makanan[0] + ", " + Makanan[1] + ", " + Makanan[3] + ", " + Makanan[2] + ".");
                System.out.println("List minuman seharga 10.000 adalah " + Minuman[2] + ", " + Minuman[3] + ", " + Minuman[4] + ".");
                break;
            }
            // Berikut adalah perulangan dari data array sebelumnya. dan saat input dimasukan akan muncul sesuai yang diprogramkan.
        }
        catch (Exception e){
            System.out.println("Pilih antara 2 harga tersebut");
            // Jika input yang dimasukan tidak sesuai akan muncul program di atas.
        }
    }
}
