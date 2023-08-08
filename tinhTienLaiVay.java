import java.util.Scanner;

public class tinhTienLaiVay {
    public static void main(String[] args) {

        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số tiền đầu tư: ");
        money = scanner.nextDouble();
        System.out.println("nhập số tháng ");
        month = scanner.nextInt();
        System.out.println("lãi suất hàng năm theo % ");
        interestRate = scanner.nextDouble();
        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate / 100) / 12 * month;
            System.out.println("tổng lãi suất: " + totalInterest);
        }
    }
}
