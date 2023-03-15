package com.unzilemedet;

import java.util.Scanner;

public class DaireDilimiAlani {
    public static void main(String[] args) {

        // Scanner sınıfını kullanarak kullanıcıdan yarıçapı ve merkez açının ölçüsünü alıyoruz
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen dairenin yarıçapını giriniz.:");
        double yarıcap = input.nextDouble();

        System.out.print("Lütfen daire diliminin merkez açısının ölçüsünü giriniz.:");
        double acı = input.nextDouble();

        // Daire diliminin alanı hesaplanıyor
        double alan = (Math.PI * ( yarıcap * yarıcap ) * acı ) / 360 ;

        // Sonuç ekrana yazdırılıyor
        System.out.println("Daire dilimin alanı.:" + alan);
    }
}
