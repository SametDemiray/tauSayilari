package org.example;
/*
Tau sayıları, bir sayının kendisi ve 1 ile bölünebildiği bölenlerinin toplamının, bir asal sayı olması durumunda o sayı olarak tanımlanır.
Başka bir deyişle, bir tau sayısı olan bir sayının, bölen sayısının kendisiyle asal olması gerekir.
Örneğin, 6 sayısını ele alalım:

Bölenleri: 1, 2, 3, 6 (toplam 4 adet)
Bu durumda, 6'nın bölen sayısı 4'tür ve 4, kendisiyle asal olduğu için 6 bir tau sayısıdır.
Tau sayıları, matematiksel olarak ilginç özelliklere sahip bir sayı dizisidir ve bazı matematiksel problemlerde önemli bir rol oynarlar.
 Özellikle, araştırmacılar tarafından çeşitli matematiksel bağlamlarda incelenmişlerdir.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Üst sınırı girin: ");
        int ustSinir = scanner.nextInt();

        System.out.println("Tau sayıları:");
        for (int i = 1; i <= ustSinir; i++) {
            if (isTau(i)) {
                System.out.print(i + ",");
            }
        }

    }

    // Bir sayının tau sayısı olup olmadığını kontrol eden metod
    public static boolean isTau(int n) {
        int divisorCount = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisorCount++;
            }
        }
        return n % divisorCount == 0;
    }
}

