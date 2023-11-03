// 2. Buatlah program bebas, dengan menerapkan if else dalam perulangan while.

import java.util.Scanner;
public class Tugas_2 {

    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        // Scanner digunakan untuk menuliskan data yang akan dimasukan ke dalam program.

        boolean hasil = true;
        int value;
        // Code di atas adalah integer dan boolean. digunakan untuk menentukan setiap variabel.

        try {

            System.out.println("Masukan angka");
            value = Keyboard.nextInt();
            // Data yang akan dimasukan harus sesuai dengan format yang telah ditentukan.

            while (hasil) {
                if (value % 2 == 0) {
                    System.out.println(value + " adalah Bilangan Genap.");
                }
                else {
                    System.out.println(value + " adalah Bilangan Ganjil.");
                }
                break;
                // Berikut adalah looping dari program definisi bilangan ganjil dan genap menggunakan perulangan while, serta if dan else.
            }

            System.out.println("");
            System.out.println("Program berhasil dijalankan.");

        }

        catch (Exception e){
            System.out.println("Hanya berjalan pada tulisan angka dan nominal bulat.");
            // jika program tidak sesuai dengan format akan muncul bagian di atas.
        }
    }
}