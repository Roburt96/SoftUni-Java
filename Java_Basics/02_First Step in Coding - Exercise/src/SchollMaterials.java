import java.util.Scanner;
public class SchollMaterials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double price_pens = 5.80;
        double price_markers = 7.20;
        double price_cleaner_per_liter = 1.20;

        int number_of_packets_pen = Integer.parseInt(input.nextLine());
        int number_of_packets_markers = Integer.parseInt(input.nextLine());
        int liters_cleaner = Integer.parseInt(input.nextLine());
        double percent_discount = Double.parseDouble(input.nextLine()) / 100;

        double total_price_pens = price_pens * number_of_packets_pen;
        double total_price_markers = price_markers * number_of_packets_markers;
        double total_price_cleaner = price_cleaner_per_liter * liters_cleaner;
        double total_price = (total_price_markers + total_price_pens + total_price_cleaner);

        double price_with_discount = total_price - (total_price * percent_discount);

        System.out.printf("%.1f", price_with_discount);



    }
}
