import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("nhập cân nặng");
        weight = scanner.nextDouble();
        System.out.println("nhập chiều cao");
        height = scanner.nextDouble();
        bmi = weight / (height * height);

        if(bmi<18.5){
            System.out.printf("%20.2f %s", bmi,"Underweight");
        }else if(bmi<25){
            System.out.printf("%20.2f %s", bmi,"Normal");

        }else if(bmi<30){
            System.out.printf("%20.2f %s", bmi,"Overweight");
        }else{
            System.out.printf("%20.2f %s", bmi,"Obese");
        }
    }
}
