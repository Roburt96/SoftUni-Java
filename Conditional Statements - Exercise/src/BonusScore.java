import java.util.Scanner;
public class BonusScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double bonusScore = 0;
        int score = Integer.parseInt(input.nextLine());

        if (score <= 100){
            bonusScore = 5;
        }else if (score > 1000){
            bonusScore = score * 0.1;
        }else{
            bonusScore = score * 0.2;
        }

        if (score % 2 == 0){
            bonusScore = bonusScore + 1;
        }else if (score % 10 == 5){
            bonusScore = bonusScore + 2;
        }
        System.out.println(bonusScore);
        System.out.println(score + bonusScore);
    }
}
