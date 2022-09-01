import java.util.Scanner;

public class TimePlusFifteenMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        if (minutes + 15 > 60){
            minutes += 15;
            minutes-=60;
            hour++;
            if (hour >=24){
                hour = 0;
            }
        }else{
            minutes += 15;
        }

        if (minutes < 10){
            System.out.printf("%d:0%d",hour,minutes);
        }else{
            System.out.printf("%d:%d",hour,minutes);
        }

    }
}
