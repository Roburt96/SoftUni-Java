import java.util.Scanner;
public class SumNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int numbers = Integer.parseInt(input.nextLine());
        for (int i = 0; i < numbers; i++) {
            int number = Integer.parseInt(input.nextLine());
            total += number;
        }
        System.out.println(total);
    }
}
