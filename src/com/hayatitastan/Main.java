package com.hayatitastan;

/**
 * Created by Dr. Hayati TAŞTAN on 2.10.2022
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("------ Ayrı değişkenler (kötü yöntem) ---------");
        String ogrenci1="Hayati";
        String ogrenci2="Eren";
        String ogrenci3="Emre";
        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);

        System.out.println("------Dizi değişken (iyi yazdırma yöntemi) ---------");

        String [] ogrenciler = new String[3];
        ogrenciler[0]="Hayati TAŞTAN";
        ogrenciler[1]="Eren TAŞTAN";
        ogrenciler[2]="Emre TAŞTAN";

        for (int i = 0; i< ogrenciler.length; i++ ){
            System.out.println(ogrenciler[i]);
        }

        System.out.println("------ Dizi değişken(en iyi yazdırma yöntemi) ------");
        for (String ogrenci: ogrenciler){
            System.out.println(ogrenci);
        }

        double[] myListOld = new double[4];
        myListOld[0] = 1.2;
        myListOld[0] = 2.3;
        myListOld[0] = 3.7;
        myListOld[0] = 4.9;

        //Aşağıdaki dizi oluşturma ve ilk değer atama yöntemi daha prtik olup, yukardıdaki yöntemle aynıdır:
        double[] myList = {1.2, 2.3, 3.7, 4.9};
        double total = 0;
        double max = myList[0];

        for (double number : myList) {
            if (max < number) {
                max = number;
            }
            total = total + number;
            System.out.println(number);
        }
        System.out.println("TOPLAM   = " + total);
        System.out.println("EN BÜYÜK = " + max);

        // multi Dimensional Arrays
        String[][] sehirler=new String[3][3]; // two dimensional array
        sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "Bursa";
        sehirler[0][2] = "Bilecik";
        sehirler[1][0] = "Ankara";
        sehirler[1][1] = "Konya";
        sehirler[1][2] = "Kayseri";
        sehirler[2][0] = "Diyarbakır";
        sehirler[2][1] = "Şanlıurfa";
        sehirler[2][2] = "Gaziantep";

        for (int i=0; i<=2; i++){
            System.out.println("--------------------");
            for (int j=0; j<=2;j++){
                System.out.println(sehirler[i][j]);
            }
        }

    }
}
