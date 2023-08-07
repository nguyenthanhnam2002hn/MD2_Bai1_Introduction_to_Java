import java.util.Scanner;

public class calculate_weight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("cân nặng (ki lô gam)");
        double weight = scanner.nextDouble();
        System.out.println("chiều cao (mét60)");
        double height = scanner.nextDouble();
        double bmi = weight / Math.pow(height,2);
        System.out.println();

        if (bmi < 18)
            System.out.println("Underweight");
        else if (bmi < 25.0)
            System.out.println("Normal");
        else if (bmi < 30.0)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }
}
