import java.util.Scanner;

public class Print_any10num
//write program to print any 10 num
    //range 23 to 33
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter value for min range");
        int min_range =scanner.nextInt();
        System.out.println("enter value for max range");
        int max_range = scanner.nextInt();

        for(int i = min_range; i <= max_range; i++){
            System.out.println(i);

        }

    }
}
