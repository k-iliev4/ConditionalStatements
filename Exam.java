import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinute = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMinute = Integer.parseInt(scanner.nextLine());

        String output = "";
        String status = "";

        int examTime = examHour * 60 + examMinute;
        int arrivalTime = arrivalHour * 60 + arrivalMinute;

        if (arrivalTime < examTime - 30){
            status = "Early";
            int diff = examTime - arrivalTime;
            if (diff < 60){
                output = String.format("%d minutes before the start", diff);
            }else{
                int h = diff / 60;
                int m = diff % 60;
                output = String.format("%d:%02d hours before the start",h,m);
            }
        }else if (arrivalTime <= examTime){
            status = "On Time";
            int diff = examTime - arrivalTime;
            output = String.format("%d minutes before the start", diff);
        }else{
            status = "Late";
            int diff = arrivalTime - examTime;
            if (diff < 60){
                output = String.format("%d minutes after the start", diff);
            }else{
                int h = diff / 60;
                int m = diff % 60;
                output = String.format("%d:%02d hours after the start",h,m);
            }
        }
        System.out.println(status);
        System.out.println(output);
    }
}
