import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double price_naylon = 1.50;
        double price_paint = 14.50;
        double price_double_paint = 5.00;
        double price_bag = 0.40;

        int naylon = Integer.parseInt(input.nextLine());
        int paint = Integer.parseInt(input.nextLine());
        int double_paint = Integer.parseInt(input.nextLine());
        int hours_to_finish = Integer.parseInt(input.nextLine());

        double total_price_naylon = price_naylon * (naylon + 2);
        double total_price_paint = price_paint * (paint + paint * 0.10);
        double total_price_double_paint = price_double_paint * double_paint;
        double total_price = total_price_naylon + total_price_paint + total_price_double_paint + price_bag;

        double total_workers_price = (total_price * 30 / 100) * hours_to_finish;
        double final_sum = total_workers_price + total_price;

        System.out.printf("%.2f", final_sum);
    }
}
