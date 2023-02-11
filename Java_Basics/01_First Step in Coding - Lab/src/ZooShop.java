import java.util.Scanner;
public class ZooShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dog_food = Integer.parseInt(scanner.nextLine());
        int cat_food = Integer.parseInt(scanner.nextLine());

        double dog_food_price = dog_food * 2.50;
        int cat_food_price = cat_food * 4;
        double total_price = dog_food_price + cat_food_price;

        System.out.printf("%.1f lv.", total_price);


    }
}
