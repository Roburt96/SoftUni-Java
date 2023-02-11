import java.util.Scanner;
public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        double price_for_greening = size * 7.61;
        double discount = price_for_greening * 0.18;
        double total_sum = price_for_greening - discount;
        System.out.println("The final price " + total_sum + " lv.");
        System.out.println("The discount is " + discount + " lv.");
    }
}
