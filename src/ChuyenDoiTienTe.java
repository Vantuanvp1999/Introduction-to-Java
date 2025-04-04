import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rate = 23000;
        System.out.println("Nhập số USD");
        double usd = scanner.nextDouble();
        double vnd = usd * rate;
        System.out.println("Số tiền VND là: " + vnd);
    }
}
