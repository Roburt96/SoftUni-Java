import java.util.Scanner;
public class ConvertorUSDtoBGN {
    public static void main(String[] args) {
        Scanner scanned = new Scanner(System.in);
        double bgn = Double.parseDouble(scanned.nextLine());
        double convertor_usd = bgn * 1.79549;
        System.out.println(convertor_usd);

    }
}
