import java.util.Scanner;
public class workday {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String day = input.nextLine();

        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Working day");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Weekend");
            default:
                System.out.println("Error");
                break;
        }
    }

}
