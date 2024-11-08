import java.util.Scanner;

public class SecondMaximum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int first = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int second = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int third = scanner.nextInt();

        int secondMax = findSecondMaximum(first, second, third);

        System.out.println("The second maximum number is: " + secondMax);
        
        scanner.close(); 
    }

    public static int findSecondMaximum(int a, int b, int c) {
        
        if ((a > b && a < c) || (a > c && a < b)) {
            return a;
        }
        else if ((b > a && b < c) || (b > c && b < a)) {
            return b;
        }
        else {
            return c;
        }
    }
}
