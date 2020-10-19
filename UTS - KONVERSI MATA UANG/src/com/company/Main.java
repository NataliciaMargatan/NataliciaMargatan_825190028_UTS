package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        USD u = new USD();
        RM m = new RM();
        SGD sin = new SGD();
        String ulang = "";
        String menu;

        do {
            Scanner input = new Scanner(System.in);
            System.out.println("\n\n\t WELCOME TO cia's MONEY CHANGER");
            System.out.println("\t ==============================");
            System.out.println("\t MATA UANG\t\t\t\t   KURS");
            System.out.println("\t 1. US dollar\t\t\t  13000");
            System.out.println("\t 2. Singapore Dollar\t  10000");
            System.out.println("\t 3. Ringgit Malaysia\t   3500\n");
            System.out.println("Pilih Mata Uang untuk di konversikan: [1/2/3] ");
            menu = input.nextLine();


            Scanner s = new Scanner(System.in);
            if (menu.equalsIgnoreCase("1")) {
                System.out.println("IDR to USD,\nmasukkan jumlah uang rupiah anda:");
                System.out.println("IDR :" + (u.nominal = s.nextFloat()));
                System.out.println(u.toString());
            } else if (menu.equalsIgnoreCase("2")) {
                System.out.println("IDR to SGD,\nmasukkan jumlah uang rupiah anda:");
                System.out.println("IDR :" + (sin.nominal = s.nextFloat()));
                System.out.println(sin.toString());
            } else {
                System.out.println("IDR to RM,\nmasukkan jumlah uang rupiah anda:");
                System.out.println("IDR :" + (m.nominal = s.nextInt()));
                System.out.println(m.toString());
            }
                System.out.println("===============================");
                System.out.print("Ingin konversi lagi? [1 = Ya] [2 = Tidak] :");
                ulang=input.nextLine();
        }while ("1".equals(ulang)) ;
        System.out.println("Thanks, Have a nice day !");
    }
}

