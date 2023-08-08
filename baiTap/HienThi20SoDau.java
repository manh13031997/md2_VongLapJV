package baiTap;

import java.util.Scanner;

public class HienThi20SoDau {
    public static void main(String[] args) {
        int number;
        int count=0;
        int n=2;
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập giá trị");
        number=scanner.nextInt();
        for (int i = 2; i < number; i++) {
            if (n == 2){
                System.out.println("giá trị là: "+n);
                count++;
            }

            n++;
            if (n %2 != 0){
                System.out.println("giá trị là: " + n);
                n++;
                count++;
            }
            if (count==20){
                return;

            }
        }

    }
}
