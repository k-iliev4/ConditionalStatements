import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermanCount = Integer.parseInt(scanner.nextLine());
        double boatRent = 0;
        double total = 0;

        switch (season){
            case "Spring":
                boatRent = 3000;
                if (fishermanCount % 2 == 0){
                    boatRent = boatRent - (boatRent * 0.5);
                }
                break;
            case "Summer":
                boatRent = 4200;
                if (fishermanCount % 2 == 0){
                    boatRent = boatRent - (boatRent * 0.5);
                }
                break;
            case "Autumn":
                boatRent = 4200;
                break;
            case "Winter":
                boatRent = 2600;
                if (fishermanCount % 2 == 0){
                    boatRent = boatRent - (boatRent * 0.5);
                }
                break;
        }

        if (fishermanCount <= 6){
            boatRent = boatRent - (boatRent * 0.1);
        }else if (fishermanCount > 7 && fishermanCount <=11){
            boatRent = boatRent - (boatRent * 0.15);
        }else{
            boatRent = boatRent - (boatRent * 0.25);
        }



        if (budget >= boatRent){
            System.out.printf("Yes! You have %.2f leva left.", budget - boatRent);
        }else{
            System.out.printf("Not enough money! You need %.2f leva.", boatRent - budget);
        }
    }
}
