import java.util.Scanner;
public class SumSeconds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first_time = Integer.parseInt(input.nextLine());
        int second_time = Integer.parseInt(input.nextLine());
        int third_time = Integer.parseInt(input.nextLine());

        int total_time = first_time + second_time + third_time;

        int minutes = total_time / 60;
        int seconds = minutes % 60;

        if (seconds < 10) {
            System.out.printf("%d:0%d", minutes, seconds);
        }else{
            System.out.printf("%d:%d", minutes, seconds);
        }


    }

}
