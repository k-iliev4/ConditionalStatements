import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();//May,June,July,August,September,October
        int nights = Integer.parseInt(scanner.nextLine());
        double apartmentPrice = 0;
        double studioPrice = 0;

        if (month.equals("May") || month.equals("October")) {
            studioPrice = 50 * nights;
            apartmentPrice = 65 * nights;
            if (nights > 7 && nights < 14) {
                studioPrice = studioPrice - (studioPrice * 0.05);
            }
            if (nights > 14) {
                studioPrice = studioPrice - (studioPrice * 0.3);
                apartmentPrice = apartmentPrice - (apartmentPrice * 0.1);
            }
        }
        if (month.equals("June") || month.equals("September")) {
            studioPrice = 75.2 * nights;
            apartmentPrice = 68.7 * nights;
            if (nights > 14) {
                studioPrice = studioPrice - (studioPrice * 0.2);
                apartmentPrice = apartmentPrice - (apartmentPrice * 0.1);
            }
        }
        if (month.equals("July") || month.equals("August")) {
            studioPrice = 76 * nights;
            apartmentPrice = 77 * nights;
            if (nights > 14) {
                apartmentPrice = apartmentPrice - (apartmentPrice * 0.1);
            }
        }

        System.out.printf("Apartment: %.2f lv.\n",apartmentPrice);
        System.out.printf("Studio: %.2f lv.",studioPrice);

    }
}
