import java.util.Scanner;

public class calculator_using_switch {
    // making calculator using the switch
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number-1");
        double num_1 = scanner.nextDouble();
        System.out.println("Enter symbol");
        char symbol = scanner.next().charAt(0);
        System.out.println("Enter number-2");
        double num_2 = scanner.nextInt();
        double result;
        switch(symbol){
    // for add
            case '+':
                result = num_1 + num_2;
                System.out.println(num_1 + " + " + num_2 + " = " + result);
                break;
// for sub
            case '-':
            result = num_1 - num_2;
            System.out.println(num_1 + " - " + num_2 + " = " +result);
            break;
// for multi
            case '*':
                result = num_1 * num_2;
                System.out.println(num_1 + " - " + num_2 + " = " +result);
                break;
// for divi
            case '/':
                result = num_1 / num_2;
                System.out.println(num_1 + " - " + num_2 + " = " +result);
                break;

            default:
                System.out.println("invalid operator");

        }

    }
}
