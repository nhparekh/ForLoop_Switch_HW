import java.util.Scanner;

public class Sum_of_range {
    //to write program prints the sum of range
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter value for min range");
        int min_range =scanner.nextInt();
        System.out.println("enter value for max range");
        int max_range = scanner.nextInt();

        int sum = 0;
        for (int i  = min_range; i <= max_range ; i++){
            sum = sum + i;

        }
        System.out.println("sum of numbers for the range of "+ min_range + " and "+ max_range + " is " + sum);
    }
}
