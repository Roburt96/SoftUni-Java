import java.util.Scanner;
public class VacantionBooks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pages_in_book = Integer.parseInt(input.nextLine());
        int read_pages_per_hors = Integer.parseInt(input.nextLine());
        int number_of_days_to_finish_book = Integer.parseInt(input.nextLine());

        int total_time_for_book = pages_in_book / read_pages_per_hors;
        int hours_a_day = total_time_for_book / number_of_days_to_finish_book;

        System.out.println(hours_a_day);



    }
}
