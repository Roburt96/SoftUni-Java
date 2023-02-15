import java.util.Scanner;
public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float price_decors = 0.10f;
        float discount_cloths = 0.10f;

        double moneyBudget = Double.parseDouble(input.nextLine());
        int amountStatistics = Integer.parseInt(input.nextLine());
        double priceCloth = Double.parseDouble(input.nextLine());

        double totalPriceCloth = amountStatistics * priceCloth;
        double totalDecorPrice = moneyBudget * price_decors;

        if (amountStatistics > 150){
            totalPriceCloth -= (totalPriceCloth * discount_cloths);
        }

        double priceEverything = totalPriceCloth + totalDecorPrice;

        if (moneyBudget >= priceEverything){
            System.out.println("Action");
            System.out.printf("Wingard start filming with %.2f leva left.", moneyBudget - priceEverything);
        }else{
            System.out.println("Not enough money");
            System.out.printf("Wingard needs %.2f leva more.", priceEverything - moneyBudget);
        }

    }
}
