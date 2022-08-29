import java.util.Scanner;

public class NumberOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int result = 0;
        String evenOrOdd = null;

        switch (operator){
            case "+":
                result = n1 + n2;
                if (result % 2 == 0){
                    evenOrOdd = "even";
                }else{
                    evenOrOdd = "odd";
                }
                System.out.printf("%d + %d = %d - %s",n1,n2,result,evenOrOdd);
                break;
            case "-":
                result = n1 - n2;
                if (result % 2 == 0){
                    evenOrOdd = "even";
                }else{
                    evenOrOdd = "odd";
                }
                System.out.printf("%d - %d = %d - %s",n1,n2,result,evenOrOdd);
                break;
            case "*":
                result = n1 * n2;
                if (result % 2 == 0){
                    evenOrOdd = "even";
                }else{
                    evenOrOdd = "odd";
                }
                System.out.printf("%d * %d = %d - %s",n1,n2,result,evenOrOdd);
                break;
            case "/":
                if (n2 == 0){
                    System.out.printf("Cannot divide %d by zero",n1);
                    break;
                }
                result = n1 / n2;
                System.out.printf("%d / %d = %d",n1,n2,result);
                break;
            case "%":
                if (n2 == 0){
                    System.out.printf("Cannot divide %d by zero",n1);
                    break;
                }
                result = n1 % n2;
                System.out.printf("%d %% %d = %d",n1,n2,result);
                break;
        }
    }
}
