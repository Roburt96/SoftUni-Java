import java.util.Scanner;
public class ProjectMaker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String architect_name = scanner.nextLine();
        int number_of_projects = Integer.parseInt(scanner.nextLine());

        int hours_to_make_all = number_of_projects * 3;

        System.out.printf("The architect " + architect_name + " will need " + hours_to_make_all +
                " hours to complete " + number_of_projects + " project/s.");

    }
}
