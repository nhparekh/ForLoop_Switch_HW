import java.util.Scanner;

public class Prime_number {
    //input prime number
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number");
        int num = scanner.nextInt();
        boolean flag = false;
        for (int i = 2; i <= num/2; ++i){

            // condition for non prime number
            if (num%i == 0){
                flag = true;
                break;
            }
        }
        if (!flag){
            System.out.println(num + " is a prime number");}
            else{
            System.out.println(num + " is not a prime number");}

        }

    }

