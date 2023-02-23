import java.util.Scanner;
public class NumsPlus3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());

        for (int i = 1; i <= num; i+=3){
            System.out.println(i);
        }
    }
}
