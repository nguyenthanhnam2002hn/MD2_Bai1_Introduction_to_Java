import java.util.Scanner;

public class use_the_operator {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("input :");
        width = scanner.nextInt();
        System.out.println("input :");
        height = scanner.nextInt();
        float area = width*height;
        System.out.println("area " + area );
    }
}
