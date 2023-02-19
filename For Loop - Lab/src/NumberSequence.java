

import java.util.Scanner;

public class NumberSequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbersInput = Integer.parseInt(scanner.nextLine());
        int minNum = Integer.MAX_VALUE;
        int maxNum = Integer.MIN_VALUE;

        for (int i = 1; i <= numbersInput; i++) {
            int numbers = Integer.parseInt(scanner.nextLine());
            if (numbers > maxNum) {
                maxNum = numbers;
            }
            if (numbers < minNum) {
                minNum = numbers;
            }
        }
        System.out.printf("Max number: %d", maxNum);
        System.out.println();
        System.out.printf("Min number: %d", minNum);

    }
}