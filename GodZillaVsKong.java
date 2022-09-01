import java.util.Scanner;

public class GodZillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int crewCount = Integer.parseInt(scanner.nextLine());
        double suitPricePerCrewPerson = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.1;

        double suitPrice = crewCount * suitPricePerCrewPerson;

        if (crewCount > 150) {
            suitPrice = suitPrice - (suitPrice * 0.1);
        }

        double total = decor + suitPrice;

        if (total <= budget){
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - total);
        }else{
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", total - budget);
        }
    }
}
