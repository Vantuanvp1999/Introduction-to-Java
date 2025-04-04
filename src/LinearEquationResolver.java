import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bài giải phương trình bậc nhất");
        System.out.println("Phương trình đã cho có dạng 'a*x + b=c' xin hãy nhập các hằng số");
        System.out.println("a : " );
        double a = scanner.nextDouble();
        System.out.println("b : " );
        double b = scanner.nextDouble();
        System.out.println("c : " );
        double c = scanner.nextDouble();
        if(a!=0){
            double answer = (c-b)/a;
            System.out.println(" Phương trình có kết quả là "+answer);
        }
        else if(b==c){
            System.out.println("Phương trình có vô số nghiệm");
        }
        else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
