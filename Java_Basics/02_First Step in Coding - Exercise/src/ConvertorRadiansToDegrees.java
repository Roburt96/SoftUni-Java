import java.util.Scanner;
public class ConvertorRadiansToDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radianos = Double.parseDouble(scanner.nextLine());
        double degrees = radianos * 180 / Math.PI;

        System.out.println(degrees);
    }
}
