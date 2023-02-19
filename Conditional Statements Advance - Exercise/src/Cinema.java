import java.util.Scanner;
public class Cinema {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String tickets_type = input.nextLine();
        int rows = Integer.parseInt(input.nextLine());
        int columns = Integer.parseInt(input.nextLine());
        int Premiere = 12;
        double Normal = 7.50;
        int Discount = 5;
        double total = 0;

        switch (tickets_type) {
            case "Premiere":
                total = Premiere * rows * columns;
                break;
            case "Normal":
                total = Normal * rows * columns;
                break;
            case "Discount":
                total = Discount * rows * columns;
                break;
        }

        System.out.printf("%.2f leva", total);



    }
}
