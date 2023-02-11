import java.util.Scanner;
public class DepositCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double deposit_sum = Double.parseDouble(input.nextLine());
        int deposit_month = Integer.parseInt(input.nextLine());
        double percent_per_year = Double.parseDouble(input.nextLine()) / 100;

        double total_interest = deposit_sum * percent_per_year;
        double interest_per_month = total_interest / 12;
        double total_sum = deposit_sum + (deposit_month * interest_per_month);

        System.out.printf("%.2f", total_sum);

    }
}
