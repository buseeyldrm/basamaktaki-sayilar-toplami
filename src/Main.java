import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner klavye=new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi= klavye.nextInt();
        int basamakToplam=0;
        int temp = sayi;

        while (sayi!=0) {
            temp = sayi % 10;

            sayi /= 10;

            System.out.println("Basamaktaki Sayılar: " +temp);
            basamakToplam += temp;

        }

        System.out.println("Basamakların toplamı: " +basamakToplam);
    }}
