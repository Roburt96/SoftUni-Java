import java.util.Scanner;

public class BiggestNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number_one = Integer.parseInt(input.nextLine());
        int number_two = Integer.parseInt(input.nextLine());

        if (number_one > number_two){
            System.out.println(number_one);
        }else {
            System.out.println(number_two);
        }

//        System.out.println(Math.max(number_one, number_two));
    }
}
