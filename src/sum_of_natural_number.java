import java.util.Scanner;

// write program of Sum of n Natural Number
public class sum_of_natural_number
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int sum = 0;
        for (int i=0; i<=n; i++){
            sum = sum + i;
            System.out.println(sum);
        }
    }
}
