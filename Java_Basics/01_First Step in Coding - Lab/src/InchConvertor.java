import java.util.Scanner;
public class InchConvertor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inch = Integer.parseInt(scanner.nextLine());
        double inchInCm = inch * 2.54;
        System.out.printf(String.valueOf(inchInCm));
    }
}
