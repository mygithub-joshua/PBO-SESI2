package com.tutorial;

import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int amount;
        int price;
        int ppn = 10;


        System.out.println("-------------------------------");
        System.out.println("MENGHITUNG PAJAK PPN 10%");
        System.out.println("-------------------------------");
        System.out.print("Harga Barang : ");
        price=input.nextInt();
        System.out.print("Jumlah barang : ");
        amount=input.nextInt();

        int total = price * amount;
        int totalAfterTax = total * ppn / 100;
        int totalBayar = total + totalAfterTax;

        //
        System.out.println("------------------------------- TOTAL");
        System.out.println("Total : " + total);
        System.out.println("PPN : " + totalAfterTax);
        System.out.println("Total yang harus dibayarkan :" + totalBayar);


    }
}
