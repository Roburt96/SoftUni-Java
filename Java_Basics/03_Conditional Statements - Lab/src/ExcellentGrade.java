import java.util.Scanner;
public class ExcellentGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int grade = Integer.parseInt(input.nextLine());
        if (grade >= 5){
            System.out.println("Excellent!");
        }
    }
}
