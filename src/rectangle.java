import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        float width,height;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the width of the rectangle: ");
        width = scanner.nextFloat();
        System.out.println("Enter the height of the rectangle: ");
        height = scanner.nextFloat();

        float area = width * height;
        System.out.println("The area of the rectangle is "+area);
    }
}
