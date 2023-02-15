import java.util.Scanner;
public class Buying {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double Budget = Double.parseDouble(input.nextLine());
        int numberVideoCard = Integer.parseInt(input.nextLine());
        int numberProcessors = Integer.parseInt(input.nextLine());
        int numberRam = Integer.parseInt(input.nextLine());

        double priceVideoCard = numberVideoCard * 250;
        double priceProcessors = numberProcessors * (priceVideoCard * 0.35);
        double priceRam = numberRam * (priceVideoCard * 0.10);
        double totalPrice = priceVideoCard + priceRam + priceProcessors;

        if (numberVideoCard > numberProcessors){
            totalPrice -= totalPrice * 0.15;
        }

        if (totalPrice <= Budget){
            System.out.printf("You have %.2f leva left!", Budget - totalPrice);
        }else{
            System.out.printf("Not enough money! You need %.2f leva more!", totalPrice - Budget);
        }

    }
}
