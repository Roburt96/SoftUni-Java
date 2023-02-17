import java.util.Scanner;
public class intervalNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        if (number < 0) {
            if (number >= -100) {
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }else if (number > 0){
            if (number <= 100){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }else{
            System.out.println("No");
        }
        }
    }

