// 3. Buatlah program zodiac dengan menggunakan fitur input dengan hasil menampilkan zodiac,
// sesuai dengan tanggal lahir yang diinputkan.

import java.util.Scanner;
public class Tugas_3 {

    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("Masukan Tanggal bulan lahir...");
        // Tanggal lahir harus dimasukan sesuai dengan ketentuan Scanner.

        int TanggalBulan;
        // Setelah itu menentukan setiap variabel yang akan diguanakan.

        TanggalBulan = Keyboard.nextInt();
        String Bulan = Keyboard.nextLine();
        // Scanner dari opsi yang telah ditentukan.

        if (TanggalBulan == 1){
            Bulan = "Januari";
        }
        else if (TanggalBulan == 2){
            Bulan = "Febrari";
        }
        else if (TanggalBulan == 3){
            Bulan = "maret";
        }
        else if (TanggalBulan == 4){
            Bulan = "April";
        }
        else if (TanggalBulan == 5){
            Bulan = "Mei";
        }
        else if (TanggalBulan == 6){
            Bulan = "Juni";
        }
        else if (TanggalBulan == 7){
            Bulan = "Juli";
        }
        else if (TanggalBulan == 8){
            Bulan = "Agustus";
        }
        else if (TanggalBulan == 9){
            Bulan = "September";
        }
        else if (TanggalBulan == 10){
            Bulan = "Oktober";
        }
        else if (TanggalBulan == 11){
            Bulan = "November";
        }
        else if (TanggalBulan == 12){
            Bulan = "Desember";
        }
        else {
            System.out.println("Sistem error karena kamu tidak menulis angka.");
            // Berikut adalah percabangan if dan else if serta else.
            // Digunakan untuk mempercabang tiap variabel data input yang telah ditentukan.

        }
        System.out.println("Bulan lahir kamu adalah " + Bulan + ".");
        // Hasil dari percabangan yang telah dilakukan sebelumnya.

        System.out.println("");
        System.out.println("Pada tanggal berapa kamu lahir...");
        int hari = Keyboard.nextInt();
        String Zodiak = Keyboard.nextLine();
        // Selanjutnya adalah menetapkan variabel untuk percabangan zodiak.

        if ((TanggalBulan == 1 && (hari >= 21 && hari <= 31) || (TanggalBulan == 2 && hari >= 1 && hari <= 19))){
            Zodiak = "Aquarius";
        }
        else if ((TanggalBulan == 2 &&  hari >= 20 && hari <= 31) || (TanggalBulan == 3 && hari >= 1 && hari <= 20)){
            Zodiak = "Pisces";
        }
        else if ((TanggalBulan == 3 && hari >= 21 && hari <= 31) || (TanggalBulan == 4 && (hari >= 1 && hari <= 19))){
            Zodiak = "Aries";
        }
        else if ((TanggalBulan == 4 && hari >= 20 && hari <= 31) || (TanggalBulan == 5 && (hari >= 1  && hari <= 20))){
            Zodiak = "Taurus";
        }
        else if ((TanggalBulan == 5 && hari >= 21 && hari <= 31) || (TanggalBulan == 6 && (hari >= 1 && hari <= 21))){
            Zodiak = "Gemini";
        }
        else if ((TanggalBulan == 6 && hari >= 22 && hari <= 31) || (TanggalBulan == 7 && (hari >= 1 && hari <= 23))){
            Zodiak = "Cancer";
        }
        else if ((TanggalBulan == 7 && hari >= 24 && hari <= 31) || (TanggalBulan == 8 && (hari >= 1 && hari <= 23))){
            Zodiak = "Leo";
        }
        else if ((TanggalBulan == 8 && hari >= 24 && hari <= 31) || (TanggalBulan == 9 && (hari >= 1 && hari <=22))){
            Zodiak = "Virgo";
        }
        else if ((TanggalBulan == 9 && hari >= 23 && hari <= 31) || (TanggalBulan == 10 && (hari >= 1 && hari <= 22))){
            Zodiak = "Libra";
        }
        else if ((TanggalBulan == 10 && hari >= 23 && hari <= 31) || (TanggalBulan == 11 && (hari >= 1 && hari <= 22))){
            Zodiak = "Scorpio";
        }
        else if ((TanggalBulan == 11 && hari >= 23 && hari <= 31) || (TanggalBulan == 12 && (hari >= 1 && hari <= 21))){
            Zodiak = "Sagitarius";
        }
        else if ((TanggalBulan == 12 && hari >= 22 && hari <= 31) || (TanggalBulan == 1 && (hari >= 1 && hari <= 20))){
            Zodiak = "Capricon";
        }
        // kode-kode di atas adalah percabangan untuk varibel zodiak. dibuat sesuai dengan tanggal dari zodiak tersebut,
        // supaya saat input dimasukan akan terprogram sesuai dengan perintah.

        System.out.println("Zodiak kamu adalah " + Zodiak + ".");
        // Hasil dari percabangan.
    }
}
