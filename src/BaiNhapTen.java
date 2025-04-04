import java.util.Scanner;

public class BaiNhapTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên của bạn");
        String name = scanner.nextLine();
        System.out.println("Chào: "+name);
    }
}
