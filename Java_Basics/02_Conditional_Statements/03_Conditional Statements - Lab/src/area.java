import java.util.Scanner;
public class area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String figure = String.valueOf(input.nextLine());
//        if (figure.equals("square")) {
//            float number = Float.parseFloat(input.nextLine());
//            System.out.printf("%.3f", (number * number));
//        }else if (figure.equals("rectangle")){
//            float number_a = Float.parseFloat(input.nextLine());
//            float number_b = Float.parseFloat(input.nextLine());
//            System.out.printf("%.3f", (number_a * number_b));
//        }else if (figure.equals("circle")){
//            float number = Float.parseFloat(input.nextLine());
//            System.out.printf("%.3f", (Math.PI * number * number));
//        }else if (figure.equals("triangle")){
//            float number_a = Float.parseFloat(input.nextLine());
//            float number_b = Float.parseFloat(input.nextLine());
//            System.out.printf("%.3f", (number_a + number_b / 2));
//        }
        switch (figure) {
            case "square" -> {
                float number = Float.parseFloat(input.nextLine());
                System.out.printf("%.3f", (number * number));
            }
            case "rectangle" -> {
                float number_a = Float.parseFloat(input.nextLine());
                float number_b = Float.parseFloat(input.nextLine());
                System.out.printf("%.3f", (number_a * number_b));
            }
            case "circle" -> {
                float number = Float.parseFloat(input.nextLine());
                System.out.printf("%.3f", (Math.PI * number * number));
            }
            case "triangle" -> {
                float number_a = Float.parseFloat(input.nextLine());
                float number_b = Float.parseFloat(input.nextLine());
                System.out.printf("%.3f", (number_a + number_b / 2));
            }
        }

    }
}
