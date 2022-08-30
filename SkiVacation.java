import java.util.Scanner;

public class SkiVacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String rating = scanner.nextLine();

        //room for one person - 18.00lv
        //apartment - 25.00lv
        //president apartment - 35.00lv
        //all per night

        int nights = days - 1;
        double discount = 0;
        double OnePersonRoomPrice = nights * 18;
        double apartmentPrice = nights * 25;
        double presidentPrice = nights * 35;
        double total = 0;

        switch (roomType){
            case "apartment":
                if (nights < 10){
                    discount = apartmentPrice * 0.3;
                }else if (nights >=10 && nights<=15){
                    discount = apartmentPrice * 0.35;
                }else if (nights > 15){
                    discount = apartmentPrice * 0.5;
                }
                total = apartmentPrice - discount;
                break;
            case "president apartment":
                if (nights < 10){
                    discount = presidentPrice * 0.1;
                }else if (nights >= 10 && nights <= 15){
                    discount = presidentPrice * 0.15;
                }else if (nights > 15){
                    discount = presidentPrice * 0.2;
                }
                total = presidentPrice - discount;
                break;
            case "room for one person":
                total = OnePersonRoomPrice;
        }

        switch (rating){
            case "positive":
                total = total + (total * 0.25);
                break;
            case "negative":
                total = total - (total * 0.1);
                break;
        }
        System.out.printf("%.2f",total);

    }
}
