import java.util.Scanner;
public class EvenNums2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());
        for (int i = 0; i <= num; i += 2) {
            double result = Math.pow(2, i);
            System.out.printf("%.0f%n", result);
        }
    }
}
