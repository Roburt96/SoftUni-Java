import java.util.Scanner;
public class Break {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String movieName = String.valueOf(input.nextLine());
        int movieLength = Integer.parseInt(input.nextLine());
        int breakTime = Integer.parseInt(input.nextLine());

        int lunchTime = breakTime / 8;
        int relaxTime = breakTime / 4;

        int timeLeft = breakTime - (lunchTime + relaxTime);

        if (timeLeft >= movieLength) {
            System.out.printf("You have enough time to watch %s and left with %s minutes free time.", movieName, timeLeft - movieLength);
        }

    }
}
