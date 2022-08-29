import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int degrees = Integer.parseInt(scanner.nextLine());
        String timeOfTheDay = scanner.nextLine();
        String outfit = null;
        String shoes = null;

        switch (timeOfTheDay){
            case "Morning":
                if (10 <= degrees && degrees <= 18){
                    outfit = "Sweatshirt";
                    shoes = "Sneakers";
                }else if (18 < degrees && degrees <= 24){
                    outfit = "Shirt";
                    shoes = "Moccasins";
                }else if (25 <= degrees){
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                }
                break;
            case "Afternoon":
                if (10 <= degrees && degrees <= 18){
                    outfit = "Shirt";
                    shoes = "Moccasins";
                }else if (18 < degrees && degrees <= 24){
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                }else if (25 <= degrees){
                    outfit = "Swim Suit";
                    shoes = "Barefoot";
                }
                break;
            case "Evening":
                if (10 <= degrees && degrees <= 18){
                    outfit = "Shirt";
                    shoes = "Moccasins";
                }else if (18 < degrees && degrees <= 24){
                    outfit = "Shirt";
                    shoes = "Moccasins";
                }else if (25 <= degrees){
                    outfit = "Shirt";
                    shoes = "Moccasins";
                }
                break;
        }

        System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
    }
}
