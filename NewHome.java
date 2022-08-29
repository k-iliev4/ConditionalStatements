import java.util.Scanner;

public class NewHome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flowerType = scanner.nextLine();
        int flowerCount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double total = 0;
        double pricePerFlower = 0;

        switch (flowerType){
            case "Roses":
                pricePerFlower = 5;
                total = flowerCount * pricePerFlower;
                if (flowerCount > 80){
                    total = total - (total * 0.1);
                }
                break;
            case "Dahlias":
                pricePerFlower = 3.8;
                total = flowerCount * pricePerFlower;
                if (flowerCount > 90){
                    total = total - (total * 0.15);
                }
                break;
            case "Tulips":
                pricePerFlower = 2.8;
                total = flowerCount * pricePerFlower;
                if (flowerCount > 80){
                    total = total - (total * 0.15);
                }
                break;
            case "Narcissus":
                pricePerFlower = 3;
                total = flowerCount * pricePerFlower;
                if (flowerCount < 120){
                    total = total + (total * 0.15);
                }
                break;
            case "Gladiolus":
                pricePerFlower = 2.5;
                total = flowerCount * pricePerFlower;
                if (flowerCount < 80){
                    total = total + (total * 0.2);
                }
                break;
        }
        if (budget >= total){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerCount, flowerType, budget - total);
        }else{
            System.out.printf("Not enough money, you need %.2f leva more.", total - budget);
        }
    }
}
