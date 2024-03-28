import java.util.Scanner;
//calculate sum of the series for n input by user
public class calculate_sum_for_n {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        double sum = 0;
       //calculate the series for n number
        for (int i = 1; i <= num; i++){
            sum += 1.0/i;
        }
        System.out.println("The sum of the series 1 + 1/2 + ... 1/"+num+ " is " +sum);
    }
}
