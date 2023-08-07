import java.util.Scanner;

public class Day_in_month {
    public static void main(String[] args) {
        String daysInMonth;
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();
        daysInMonth = switch (month) {
            case 2 -> "28 or 29";
            case 1, 3, 5, 7, 8, 10, 12 -> "31";
            case 4, 6, 9, 11 -> "30";
            default -> "";
        };
        if (!daysInMonth.isEmpty()) System.out.printf("The month '%d' has %s days!", month, daysInMonth);
        else System.out.print("Invalid input!");
        }
    }

