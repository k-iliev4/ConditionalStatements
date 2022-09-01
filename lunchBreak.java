import java.util.Scanner;

public class lunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String seriesName = scanner.nextLine();
        int episodeLength = Integer.parseInt(scanner.nextLine());
        int breakLength = Integer.parseInt(scanner.nextLine());

        double lunchTime = breakLength / 8.0;
        double chillTime = breakLength / 4.0;

        double timeLeft = breakLength - (lunchTime + chillTime);

        if (timeLeft < episodeLength){
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",seriesName, Math.ceil(episodeLength - timeLeft));
        }else{
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time", seriesName, Math.ceil(timeLeft - episodeLength));
        }

    }
}
