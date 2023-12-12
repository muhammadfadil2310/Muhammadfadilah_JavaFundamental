package com.javaprogram;

public class Latihan1 {
    public static void main(String[] args) {
        System.out.println("saya fadil");

        String kata1 = "hello word";
        System.out.println(kata1);

        int a = 4;
        int b = 5;
        int c = a+b;
        System.out.println("penambahan dari a + b = " +c);

        double angkaBerkoma = 23.000;
        System.out.println("penambahan dari a + b = " +c);
        System.out.println(c+angkaBerkoma);

        String kataBaru = "Nama Saya";
        String namaSaya = "Muhammad Fadil";
        String gabungKata = "Nama Saya Muhammad Fadil";
        System.out.println(gabungKata);

        String url = "https://translate.google.com/";
        boolean isThisTrue = url.startsWith("http");
        System.out.println(isThisTrue);
        boolean isThisTrue2 = url.endsWith("cot");
        System.out.println(isThisTrue);

        String textRegex = "MuhammadFadil2310";
        System.out.println(textRegex.replaceAll("[A-Z0-9]", ""));

        String textRegex2 = "Saya mau punya uang 1 milliar";
        System.out.println(textRegex2.replaceAll("[A-Za-z]", ""));

        String namaMakan = "Seblak,Lontong Sayur,Soto Daging,Ayam Gulai";
        String [] arrayMakan = namaMakan.split (",");
        System.out.println(arrayMakan[0]);
        System.out.println(arrayMakan[2]);

    }
}
