// https://app.patika.dev/
// https://app.patika.dev/thendbranch

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak,
        yıldızlar(*) ile ekrana ters üçgen çizen programı yazın.
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Basamak Sayısını Giriniz : ");
        int sayi = input.nextInt();

        for (int i = 1; i <= sayi; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2*(sayi-i))+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}