import java.util.Scanner;

public class Multiplication_Print_Table {
    // To Write program of multiplication table of any number
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner . nextInt();
        for(int i=1; i <=12; i++){
            System.out.println(i*n);
        }
    }
}
