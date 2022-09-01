import java.util.Scanner;

public class WorldRecordSwimming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordInSeconds = Double.parseDouble(scanner.nextLine());
        double distanceInMeters = Double.parseDouble(scanner.nextLine());
        double meterSwumInSeconds = Double.parseDouble(scanner.nextLine());

        double inSeconds = distanceInMeters * meterSwumInSeconds;
        double delay = Math.floor(distanceInMeters / 15) * 12.5;

        double total = inSeconds + delay;

        if (recordInSeconds < total){
            System.out.printf("No, he failed! He was %.2f seconds slower.",total - recordInSeconds);
        }else{
            System.out.printf("Yes, he succeeded! The world record is %.2f seconds.", total);
        }
    }
}
