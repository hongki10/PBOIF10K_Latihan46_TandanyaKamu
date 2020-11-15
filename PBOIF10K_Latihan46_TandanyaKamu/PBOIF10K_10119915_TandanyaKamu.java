import java.util.Date;
import java.util.Scanner;

/**
 * Nama     : M.Hongki Alfikram
 * Kelas    : IF10K
 * NIM      : 10119915
 * Program  : Menampilkan Identiatas dan Karakter
 */
 public class PBOIF10k10119915Latihan46 {
    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);
        Age age = new Age(2020);
        System.out.print("Masukkan Tahun Lahir : ");
        age.setYearBirth(baca.nextInt());
        System.out.println("");
        System.out.println("===Hasil Perhitungan Umur===");
        System.out.println("Tahun Lahir Anda : " + age.getYearBirth());
        System.out.println("Hari ini Tahun : " + age.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah : " + age.hitungUmur() + " Tahun");
        age.tandanyaKamu(age.hitungUmur());
    }
}