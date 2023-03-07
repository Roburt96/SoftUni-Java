import java.util.Scanner;
public class Hellobygender {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double age = Double.parseDouble(input.nextLine());
        String gender = input.nextLine();

        if ("m".equals(gender)){
            if (age >= 16){
                System.out.println("Mr.");
            }else{
                System.out.println("Master.");
            }
        }else if ("f".equals(gender)){
            if (age >= 16) {
                System.out.println("Ms.");
            }else {
                System.out.println("Miss");
            }
        }

    }
}
