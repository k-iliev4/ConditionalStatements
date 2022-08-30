import java.util.Scanner;

public class LocalStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double total = 0;

        if (city.equals("Sofia")){
            switch (product){
                case "coffee":
                    total = quantity * 0.5;
                    break;
                case "water":
                    total = quantity * 0.8;
                    break;
                case "beer":
                    total = quantity * 1.2;
                    break;
                case "sweets":
                    total = quantity * 1.45;
                    break;
                case "peanuts":
                    total = quantity * 1.6;
                    break;
            }
        }else if (city.equals("Plovdiv")){
            switch (product){
                case "coffee":
                    total = quantity * 0.4;
                    break;
                case "water":
                    total = quantity * 0.7;
                    break;
                case "beer":
                    total = quantity * 1.15;
                    break;
                case "sweets":
                    total = quantity * 1.3;
                    break;
                case "peanuts":
                    total = quantity * 1.5;
                    break;
            }
        }else if (city.equals("Varna")){
            switch (product){
                case "coffee":
                    total = quantity * 0.45;
                    break;
                case "water":
                    total = quantity * 0.7;
                    break;
                case "beer":
                    total = quantity * 1.1;
                    break;
                case "sweets":
                    total = quantity * 1.35;
                    break;
                case "peanuts":
                    total = quantity * 1.55;
                    break;
            }
        }
        System.out.printf("%.1f",total);
    }
}
