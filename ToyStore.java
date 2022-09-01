import java.util.Scanner;

public class ToyStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double holidayPrice = Double.parseDouble(scanner.nextLine());

        int puzzleCount = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int teddyBears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        int totalCount = puzzleCount + dolls + teddyBears + minions + trucks;

        double puzzlePrice = puzzleCount * 2.6;
        double dollsPrice = dolls * 3;
        double teddyBearsPrice = teddyBears * 4.1;
        double minionsPrice = minions * 8.2;
        double truckPrice = trucks * 2;

        double total = puzzlePrice + dollsPrice + teddyBearsPrice + minionsPrice + truckPrice;

        if (totalCount >= 50){
            total = total - (total * 0.25);
        }
        double rent = total * 0.1;

        total = total - rent;

        if (total >= holidayPrice){
            System.out.printf("Yes! %.2f lv left.",total - holidayPrice);
        }else{
            System.out.printf("Not enough money! %.2f lv needed.", holidayPrice - total);
        }
    }
}
