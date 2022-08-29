import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String destination = null;
        double expense = 0;
        String place = null;

        if (budget <= 100){
            destination = "Bulgaria";
            switch (season){
                case "summer":
                    expense = budget * 0.3;
                    place = "Camp";
                    break;
                case "winter":
                    expense = budget * 0.7;
                    place = "Hotel";
                    break;
            }
        }else if (budget <= 1000){
            destination = "Balkans";
            switch (season){
                case "summer":
                    expense = budget * 0.4;
                    place = "Camp";
                    break;
                case "winter":
                    expense = budget * 0.8;
                    place = "Hotel";
                    break;
            }
        }else{
            destination = "Europe";
            expense = budget * 0.9;
            place = "Hotel";
        }
        System.out.printf("Somewhere in %s \n",destination);
        System.out.printf("%s - %.2f", place, expense);
    }
}
