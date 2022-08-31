import java.util.Scanner;

public class ExcellentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        if (num >= 5 && num <= 6){
            System.out.println("Excellent!");
        }
    }
}
