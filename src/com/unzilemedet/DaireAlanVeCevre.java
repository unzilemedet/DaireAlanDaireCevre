package com.unzilemedet;

import java.util.Scanner;

public class DaireAlanVeCevre {
    public static void main(String[] args) {

        // Scanner sınıfını kullanarak kullanıcıdan yarıçapı alıyoruz
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen dairenin yarıçapını giriniz.:");
        double yaricap=input.nextDouble();

        // Dairenin alanı hesaplanıyor
        double alan = Math.PI * yaricap * yaricap ;

        // Dairenin çevresi hesaplanıyor
        double cevre = 2 * Math.PI * yaricap ;

        // Sonuçlar ekrana yazdırılıyor
        System.out.println("Dairenin alanı :" + alan);
        System.out.println("Dairenin çevresi :" + cevre);

    }
}