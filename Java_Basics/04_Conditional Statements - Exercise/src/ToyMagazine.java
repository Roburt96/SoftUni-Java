import java.util.Scanner;
public class ToyMagazine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float price_puzzle = 2.60f;
        int price_doll = 3;
        float price_teddy_bear = 4.10f;
        float price_minions = 8.20f;
        int price_truck = 2;


        double vacantion_price = Double.parseDouble(input.nextLine());
        int numberOfPuzzles = Integer.parseInt(input.nextLine());
        int numberOfDolls = Integer.parseInt(input.nextLine());
        int numberOfTeddyBears = Integer.parseInt(input.nextLine());
        int numberOfMinions = Integer.parseInt(input.nextLine());
        int numberOfTrucks = Integer.parseInt(input.nextLine());

        int totalToys = numberOfPuzzles + numberOfDolls + numberOfTeddyBears + numberOfMinions + numberOfTrucks;
        double totalPrice = numberOfPuzzles * price_puzzle + numberOfDolls * price_doll +
                numberOfTeddyBears * price_teddy_bear + numberOfMinions * price_minions + numberOfTrucks * price_truck;


        if (totalToys >= 50){
            double discount = totalPrice * 0.25;
            totalPrice -= discount;
        }
        double rent_price = totalPrice * 0.10;
        totalPrice -= rent_price;
        if (totalPrice >= vacantion_price){
            double final_sum = totalPrice - vacantion_price;
            System.out.printf("Yes! %.2f lv left.", final_sum);
        }else {
            System.out.printf("Not enough money! %.2f lv needed.", vacantion_price - totalPrice);
        }
    }
}
