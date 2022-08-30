import java.util.Date;
import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0;
        if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")) {
            switch (fruit) {
                case "banana":
                    price = quantity * 2.5;
                    break;
                case "apple":
                    price = quantity * 1.2;
                    break;
                case "orange":
                    price = quantity * 0.85;
                    break;
                case "grapefruit":
                    price = quantity * 1.45;
                    break;
                case "kiwi":
                    price = quantity * 2.7;
                    break;
                case "pineapple":
                    price = quantity * 5.5;
                    break;
                case "grapes":
                    price = quantity * 3.85;
                    break;
                default:
                    System.out.println("error");
                    break;
            }
            System.out.println(price);
        }else if (day.equals("Saturday")||day.equals("Sunday")){

            switch (fruit) {
                case "banana":
                    price = quantity * 2.7;
                    break;
                case "apple":
                    price = quantity * 1.25;
                    break;
                case "orange":
                    price = quantity * 0.9;
                    break;
                case "grapefruit":
                    price = quantity * 1.6;
                    break;
                case "kiwi":
                    price = quantity * 3;
                    break;
                case "pineapple":
                    price = quantity * 5.6;
                    break;
                case "grapes":
                    price = quantity * 4.2;
                    break;
                default:
                    System.out.println("error");
                    break;
            }
            System.out.println(price);

        }else{
            System.out.println("error");
        }
    }
}
