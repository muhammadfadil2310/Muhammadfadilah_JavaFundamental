package com.javaprogram;

public class pengulanganDoWhile{
    public static void main(String[] args) {
//        do{
//            aksi
//
//      }while (kondisi);
        System.out.println("ini awal dari program");

        int a=0;
        boolean kondisi = true;
        do {
            a++;
            System.out.println("do while ke-" + a);
            if (a==3) {
                kondisi = false;

            }

        }while (kondisi) ;

        System.out.println("ini akhir dari program");

        }

    }

