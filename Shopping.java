import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int gpuCount = Integer.parseInt(scanner.nextLine());
        int cpuCount = Integer.parseInt(scanner.nextLine());
        int ramCount = Integer.parseInt(scanner.nextLine());

        double gpuPrice = gpuCount * 250;
        double cpuPrice = cpuCount * (gpuPrice * 0.35);
        double ramPrice = ramCount * (gpuPrice * 0.1);

        double total = gpuPrice + cpuPrice + ramPrice;

        if (gpuCount > cpuCount){
            total = total * 0.85;
        }

        if (total > budget){
            System.out.printf("Not enough money! You need %.2f leva more!",total - budget);
        }else{
            System.out.printf("You have %.2f leva left!", budget - total);
        }
    }
}
