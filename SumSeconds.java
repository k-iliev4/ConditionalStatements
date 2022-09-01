import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sec1 = Integer.parseInt(scanner.nextLine());
        int sec2 = Integer.parseInt(scanner.nextLine());
        int sec3 = Integer.parseInt(scanner.nextLine());

        int total = sec1 + sec2 + sec3;

        int minutes = total / 60;
        int seconds = total % 60;

        if (seconds<10){
            System.out.printf("%d:0%d", minutes,seconds);
        }else{
            System.out.printf("%d:%d",minutes, seconds);
        }
    }
}
