import java.util.Scanner;
public class Nums100to200 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        if (number < 100){
            System.out.println("Less than 100");
        }else if (number <= 200) {
            System.out.println("Between 100 and 200");
        }else{
            System.out.println("More than 200");
        }
    }
}
