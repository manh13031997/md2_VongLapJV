import java.util.Scanner;

public class uocChungLonNhat {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập a: ");
        a = scanner.nextInt();
        System.out.println("nhập b: ");
        b = scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("không co ước chung lớn nhất");
        }
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }

        }
        System.out.println("ước chung lớn nhất: " + a);
        System.out.println("ước chung lớn nhất: " + b);
    }
}
