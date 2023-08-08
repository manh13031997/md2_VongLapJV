package baiTap;

import java.util.Scanner;

public class HienThiLoaiHinh {
    public static void main(String[] args) {
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println();
        for (int i = 0; i <5 ; i++) {
            for (int j = 5; j >i ; j--) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
