public class Fibonacci_number {

    // print fibonacci number
    public static void main(String[] args) {

      int num1= 1,num2= 2,count = 12;
        System.out.println(num1 +" " +num2);
        int num3;

        for (int i = 2; i < count; i++){
            num3 = num1 + num2;
            System.out.println( "" +num3);
            num1 = num2;
            num2 = num3;


        }
    }
}
