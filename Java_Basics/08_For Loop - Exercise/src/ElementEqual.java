
import java.util.Scanner;
public class ElementEqual {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfInput = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int maxNumber = Integer.MIN_VALUE;

        for (int i = 1; i <= numberOfInput; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            sum += number;
            if (number > maxNumber) {
                maxNumber = number;
            }
        }
        int sumWithoutMaxNum = sum - maxNumber;
        if (maxNumber == sumWithoutMaxNum) {
            System.out.println("Yes");
            System.out.println("Sum = " + maxNumber);
        } else {
            int difference = Math.abs(maxNumber - sumWithoutMaxNum);
            System.out.println("No");
            System.out.println("Diff = " + difference);
        }
    }
}
