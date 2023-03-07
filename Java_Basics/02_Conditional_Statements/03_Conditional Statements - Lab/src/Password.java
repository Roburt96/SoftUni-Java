import java.util.Scanner;
public class Password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password = "s3cr3t!P@ssw0rd";
        String enter_password = String.valueOf(input.nextLine());
        if (password.equals(enter_password)) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }

    }
}
